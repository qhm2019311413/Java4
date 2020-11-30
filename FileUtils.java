package system;

import java.io.*;

public class FileUtils {

    public boolean saveStuMsg(Student student){
        File file = null;
        boolean f = true;
        try {
            file = new File("A.txt");
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
            PrintWriter pw = new PrintWriter(osw);
            pw.println(student.getMessage());
            pw.flush();
            pw.close();
            osw.close();
            fos.close();
        }catch (IOException e){
            f = false;
            System.out.println("保存学生信息失败！"+e.getMessage());
        }
        return f;
    }

    public boolean saveStrMsg(String str){
        File file = null;
        boolean f = true;
        try {
            file = new File("A.txt");
            FileOutputStream fos = new FileOutputStream(file,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
            PrintWriter pw = new PrintWriter(osw);
            pw.println(str);
            pw.flush();
            pw.close();
            osw.close();
            fos.close();
        }catch (IOException e){
            f = false;
            System.out.println("保存字符信息失败！"+e.getMessage());
        }
        return f;
    }

    public String readB(){
        String str = "";
        File file = null;
        try {
            file = new File("B.txt");
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"utf-8");
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null)
                str += line;
            br.close();
            isr.close();
        }catch (Exception e){
            System.out.println("读取文件B错误！"+e.getMessage());
        }
        return str;
    }

}
