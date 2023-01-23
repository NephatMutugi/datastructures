package org.neph;

/**
 * @ Author NMuchiri
 **/
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class FileMover {
    public static void main(String[] args) {
        String host = "your_host";
        int port = 22;
        String user = "your_username";
        String password = "your_password";
        String sourceFilePath = "/home/ken20549/T24UPLOADS/CRB_TEST";
        String destinationDirPath = "/home/ken20549/T24UPLOADS/PROCESSED/";

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_");
        String datePrefix = dateFormat.format(new Date());

        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();

            Channel channel = session.openChannel("sftp");
            channel.connect();
            ChannelSftp sftpChannel = (ChannelSftp) channel;

            File sourceFile = new File(sourceFilePath);
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            sftpChannel.put(fileInputStream, destinationDirPath + datePrefix + sourceFile.getName());
            fileInputStream.close();
            sftpChannel.exit();
            session.disconnect();
            System.out.println("File moved successfully!");
        } catch (Exception e) {
            System.out.println("File moving failed: " + e.getMessage());
        }
    }
}
