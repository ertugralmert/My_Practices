package com.mert.myexamples.OOP_Example_FileProcessor;

import com.mert.myexamples.OOP_Example_FileProcessor.entity.FileProcessor;
import com.mert.myexamples.OOP_Example_FileProcessor.entity.ImageFileProcessor;
import com.mert.myexamples.OOP_Example_FileProcessor.entity.TextFileProcessor;

public class Runner {

    /**
     *FileProcessor -> Inheritance class -> extends yani miras alınacak class
     * Sonrasında diğer iki classTa extends yapıp override işlemi yaptım.
     * Override sırasında otomatik super oluştu ancak onu sildim ççünkü default constructor
     * çağırıyordu ve main methodta'ki "dosya işleniyor" da alıyordu.
     * Sonrasında Runner class'ında object tanımladık ancak bunu Polimorphism ile yaptık.
     * @param args
     */

    public static void main(String[] args) {
        FileProcessor fp1 = new ImageFileProcessor();
        FileProcessor fp2 = new TextFileProcessor();

        fp1.processorFile();
        fp2.processorFile();
    }

    /**
     * Resim dosyası işleniyor
     * Metin Dosyası İşleniyor.
     */
}
