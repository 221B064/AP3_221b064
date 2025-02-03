public class Test {
    public static void main(String[] args){
        Voice voiceSystem = new Voice();
        Animal[] animals = voiceSystem.prepareVoice();
        System.out.println("The animals are making there voices: ");
        voiceSystem.hear(animals);
    }
}