package challengeFeb14;

public class CodingChallenge {
    public static String memorySize(String memory){
        double rawMemory = Double.parseDouble(memory.substring(0,memory.length()-2));
        double newMemory;
        if(memory.endsWith("GB")){
            newMemory = rawMemory * 1000;
        }else {
            newMemory = rawMemory;
        }
        double actualMemory = newMemory * .93;

        if(actualMemory >= 1000){
            return actualMemory / 1000 + "GB";
        }else return actualMemory + "MB";


    }

    public static void main(String[] args) {
        System.out.println(memorySize("512MB"));
        System.out.println(memorySize("1GB"));
        System.out.println("32GB");
    }
}
