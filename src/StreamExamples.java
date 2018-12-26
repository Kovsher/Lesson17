import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamExamples {
//    public static void justRead() {
//        FileInputStream Fis = null;
//        try {
////            Fis = new FileInputStream("test/test.txt");
//            Fis = new FileInputStream("C:\\Users\\Java Core Student 1\\IdeaProjects\\Lesson17\\test\\test.txt");
//            System.out.println("file size in bytes:" + Fis.available());
//            int content;
//            while ((content = Fis.read()) != -1) {
//                System.out.println((char) content);
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//
//        } finally {
//            if (Fis != null) {
//                try {
//                    Fis.close();
//
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
//
//
//    }

    //    public static void main(String[] args) {
////        justRead();
//        readWithResources();
//  }
//
//    public static void readWithResources() {
//        try (FileInputStream Fis = new FileInputStream("test/test.txt")) {
//            System.out.println("fike size" + Fis.available());
//            int counter;
//            while ((counter = Fis.read()) != -1) {
//                System.out.println((char) counter);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
//    public static void readAndWrite() {
//        try (FileInputStream Fis = new FileInputStream("test/test.txt");
//             FileOutputStream Fos = new FileOutputStream("test/result.txt")) {
//            int content;
//            while ((content = Fis.read()) != -1) {
//                System.out.println((char) content);
//                Fos.write(content);
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        readAndWrite();
//    }
//
//    public static void bufferedInputStream() {
//        InputStream inStream = null;
//        BufferedInputStream bis = null;
//        BufferedOutputStream bus = null;
//
//        try {
//            inStream = new FileInputStream("test/test.txt");
//            bis = new BufferedInputStream(inStream);
//            bus = new BufferedOutputStream(new FileOutputStream("test/buff_res.txt"));
//
//            while (bis.available() > 0) {
//                char c = (char) bis.read();
//                System.out.println("char " + c);
//                bus.write(c);
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }finally {
//
//            if (inStream != null && bis != null && bus != null) {
//                try {
//                    inStream.close();
//                    bis.close();
//                    bus.close();
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//
//                }
//            }
//        }
//        }
//
//    public static void main(String[] args) {
//        bufferedInputStream();
//    }

    public static List<String> getLinesFromFile(String FilePath) {

        File File = new File(FilePath);
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(File))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> File = getLinesFromFile("test/test.txt");
        for (String s : File) {
            System.out.println(s);
        }
    }

}