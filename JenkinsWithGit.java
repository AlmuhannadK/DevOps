public class JenkinsWithGit {
    public static void main(String[] args) {
        
        int charPerLine = 0;

        for(int i = 33; i < 256; i++; charPerLine++){
            System.out.println((char)i+((charPerLine%10==0)?"\n":"\t"));
            System.out.println();
        }

        System.out.println("modifying the file to see the changes on Jenkins server!!");
    }
}