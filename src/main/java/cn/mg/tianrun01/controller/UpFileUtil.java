package cn.mg.tianrun01.controller;

import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UpFileUtil {
    /**
     * 上传单个文件的方法
     * @param request
     * @return 文件名
     */
    public String upFile(HttpServletRequest request){
        String name=null;
        try {
            //获取classpath的路径
            String str= ResourceUtils.
                    getURL("classpath:").getPath();
            str+="static/pics";//取到static/pics的路径
            //将request转为MultipartRequest，获取文件file
            MultipartFile mf=
                    ((MultipartRequest)request).getFile("file");
            //1.jpg
            String  oldName=mf.getOriginalFilename();//取原有名字----为了后缀名
            int  index=oldName.lastIndexOf(".");
            String last=oldName.substring(index);//截取后缀名
            String frist= UUID.randomUUID().toString();
            String fileName=frist+last;

            File file=new File(str,fileName);//构建新文件

            mf.transferTo(file);//传输
            name=fileName;

            //System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }

        return  name;
    }

    public List<String> upFiles(HttpServletRequest request){
        List<String> fileNames=null;

        try {
            //获取classpath的路径
            String str=ResourceUtils.getURL("classpath:").getPath();
            str+="static/pics";//取到static/pics的路径
            //将request转为MultipartRequest，获取文件file
            List<MultipartFile> mfs=
                    ((MultipartRequest)request).getFiles("file");
            fileNames=new ArrayList<String>();
            for(MultipartFile mf:mfs) {
                String oldName = mf.getOriginalFilename();//取原有名字----为了后缀名
                int index = oldName.lastIndexOf(".");
                String last = oldName.substring(index);//截取后缀名
                String frist = UUID.randomUUID().toString();
                String fileName = frist + last;

                File file = new File(str, fileName);//构建新文件

                mf.transferTo(file);//传输
                fileNames.add(fileName);
            }

            //System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }

        return fileNames;
    }
}
