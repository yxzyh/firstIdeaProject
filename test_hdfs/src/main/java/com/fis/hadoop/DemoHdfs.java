package com.fis.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class DemoHdfs {
    public static void main(String[] args) throws URISyntaxException, IOException {
        Configuration con = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://dn2fis01:9000"),con);
        InputStream in = fs.open(new Path("/sqoop/tb_test/part-m-00000"));
        OutputStream out = new FileOutputStream("d:/data4.txt");
        IOUtils.copyBytes(in,out,4096,true);

    }
}
