package com.test.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("abc.txt");
		
		BufferedWriter bf=new BufferedWriter(fw);
		
		bf.write("Whats is a poem?\r\n"
				+ "A poem is a piece of writing in which"
				+ " the words are chosen for their beauty and sound and are carefully arranged, often in short lines which rhyme. Synonyms: verse, song, lyric, rhyme More Synonyms of poem. ");
		bf.write(100);
	bf.close();
	System.out.println("success");
		
	}

}
