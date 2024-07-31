<<<<<<< HEAD
/**

Byte Streams
	InputStream( Files.newInputStream) 
	      InputStreamReader
		FileInputStream
			BufferedInputStream 
				DataInoutStream

	
		
	OutputStream ( Files.newOuputStream)
	     OutputStreamWriter
		FileOutputStream   
			BufferedOutputStream
				DataOutputStream


	
	
Byte streams should only be used for the most primitive I/O
All other streams built on byte streams.

Character streams are often "wrappers" for byte streams. The character stream uses the byte stream to perform the physical I/O, while the character stream handles translation between characters and bytes. FileReader, for example, uses FileInputStream, while FileWriter uses FileOutputStream.


Character Streams
	Reader
		FileReader
			BufferedReader (Files.newBufferedReader )
	
	

ByteChannel 
	SeekableByteChannel ( Files.newByteChannel)
		FileChannel
		

	Writer 
		FileWriter
			PrintWriter
			BufferedWriter (Files.newBufferedWriter) 
			
		


File I/O Methods Arranged from Less Complex to More Complex


The flush method is valid on any output stream, but has no effect unless the stream is buffered

InputStreamReader


OutputStreamWriter

read
readLine


write
println

close
flush.
exit

The scanner API breaks input into individual tokens associated with bits of data.
	hasNext, 
	next

The formatting API assembles data into nicely formatted, human-readable form.
	
	Elements of a Format Specifier.
	
Conversions:
	• d formats an integer value as a decimal value.
	• f formats a floating point value as a decimal value.
	• n outputs a platform-specific line terminator.
	• x formats an integer as a hexadecimal value.
	• s formats any value as a string.
	• tB formats an integer as a locale-specific month name.

Pasted from <http://docs.oracle.com/javase/tutorial/essential/io/formatting.html> 

	 System.out.format("%f, %1$+020.10f %n", Math.PI);
	
DataStreams

DataStreams uses one very bad programming technique: it uses floating point numbers to represent monetary values. In general, floating point is bad for precise values. It's particularly bad for decimal fractions, because common values (such as 0.1) do not have a binary representation.
The correct type to use for currency values is java.math.BigDecimal. Unfortunately, BigDecimal is an object type, so it won't work with data streams. However, BigDecimal will work with object streams, which are covered in the next section.
 


Just as data streams support I/O of primitive data types, object streams support I/O of objects. Most, but not all, standard classes support serialization of their objects. Those that do implement the marker interface Serializable.
 


ObjectStream can contain a mixture of primitive and object values







• preVisitDirectory – Invoked before a directory's entries are visited.
• postVisitDirectory – Invoked after all the entries in a directory are visited. If any errors are encountered, the specific exception is passed to the method.
• visitFile – Invoked on the file being visited. The file's BasicFileAttributes is passed to the method, or you can use the file attributes package to read a specific set of attributes. For example, you can choose to read the file's DosFileAttributeView to determine if the file has the "hidden" bit set.
• visitFileFailed – Invoked when the file cannot be accessed. The specific exception is passed to the method. You can choose whether to throw the exception, print it to the console or a log file, and so on.

 

• CONTINUE – Indicates that the file walking should continue. If the preVisitDirectory method returns CONTINUE, the directory is visited.
• TERMINATE – Immediately aborts the file walking. No further file walking methods are invoked after this value is returned.
• SKIP_SUBTREE – When preVisitDirectory returns this value, the specified directory and its subdirectories are skipped. This branch is "pruned out" of the tree.
• SKIP_SIBLINGS – When preVisitDirectory returns this value, the specified directory is not visited, postVisitDirectory is not invoked, and no further unvisited siblings are visited. If returned from the postVisitDirectory method, no further siblings are visited. Essentially, nothing further happens in the specified directory.



public FileVisitResult
     preVisitDirectory(Path dir,
         BasicFileAttributes attrs) {
    (if (dir.getFileName().toString().equals("SCCS")) {
         return SKIP_SUBTREE;
    }
    return CONTINUE;
}

Finder finder = new Finder(pattern);
Path startingDir = ...;
Files.walkFileTree(startingDir, opts, Integer.MAX_VALUE, finder);



 * 
 *


/**
 * @author rmudiga
 *
 *
import static java.nio.file.StandardOpenOption.*;

import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.*;
import java.nio.charset.Charset;
import static java.nio.file.FileVisitResult.*;

public   class PrintFiles
extends SimpleFileVisitor<Path> {

// Print information about
// each type of file.
@Override
public FileVisitResult visitFile(Path file,
                               BasicFileAttributes attr) {
    if (attr.isSymbolicLink()) {
        System.out.format("Symbolic link: %s ", file);
    } else if (attr.isRegularFile()) {
        System.out.format("Regular file: %s ", file);
    } else {
        System.out.format("Other: %s ", file);
    }
    System.out.println("(" + attr.size() + "bytes)");
    return CONTINUE;
}

// Print each directory visited.
@Override
public FileVisitResult postVisitDirectory(Path dir,
                                      IOException exc) {
    System.out.format("Directory: %s%n", dir);
    return CONTINUE;
}

// If there is some error accessing
// the file, let the user know.
// If you don't override this method
// and an error occurs, an IOException 
// is thrown.
@Override
public FileVisitResult visitFileFailed(Path file,
                                   IOException exc) {
    System.err.println(exc);
    return CONTINUE;
}

public static void main(String args[]){
	System.out.println(" File traversing Started ..... \n");
		
	Path startingDir = Paths.get("C:\\Work\\mrvsr");	
	PrintFiles pf = new PrintFiles();
	try{
	Files.walkFileTree(startingDir, pf);
	} catch( Exception e){
		System.out.println(e.toString());
	}
	
}
}
/********************/

/**
 * 
 */


/**
 * @author rmudiga
 *

import static java.nio.file.StandardOpenOption;

import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;

public class DirTest {

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
		for (Path name: dirs) {
		    System.err.println(name);
		}
		
		Path dir = Paths.get("C:\\Work\\mrvsr");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
		    for (Path file: stream) {
		        System.out.println(file.toString());
		    }
		} catch (IOException | DirectoryIteratorException x) {
		    // IOException can never be thrown by the iteration.
		    // In this snippet, it can only be thrown by newDirectoryStream.
		    System.err.println(x);
		}
		
	}
}
/***********************************/

/**
 * 
 */


/**
 * @author rmudiga
 *
 *
import static java.nio.file.StandardOpenOption.*;

import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.*;
import java.io.*;
import java.nio.charset.Charset;

public class LogFileTest {

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World !";
		byte data[] = s.getBytes();
		Path p = Paths.get("c:\\work\\mrvsr\\javatestwrite.txt");
		
		try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE,APPEND))){
			out.write(data,0,data.length);			
		} catch (IOException x){
			System.err.println(x);
		}

		try (SeekableByteChannel sbc = Files.newByteChannel(p)){
			ByteBuffer buf = ByteBuffer.allocate(10);
			
			String encoding = System.getProperty("file.encoding");
			while (sbc.read(buf) > 0){
				buf.rewind();
				System.out.println(Charset.forName(encoding).decode(buf));
				buf.flip();
			}
			
		}catch (IOException x) {
		    System.out.println("caught exception: " + x);
		}
		
	}

}
/**************************/


/**
 * 

 *
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.charset.*;
import java.io.*;

/**
 * @author rmudiga
 * 
 *
public class PathTest {
	/**
	 * 
	 *
	public PathTest() {
		// TODO Auto-generated constructor stub
		System.out.println("test");
	}

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path file = Paths.get("C:\\Work\\javatest.txt");
		Path tfile = Paths.get("C:\\Work\\javatest_copy.txt");
		Path tfile2 = Paths.get("C:\\Work\\javatest_move.txt");
		try {

			System.out.format("toString: %s%n", file.toString());
			System.out.format("getFileName: %s%n", file.getFileName());
			System.out.format("getName(0): %s%n", file.getName(0));
			System.out.format("getNameCount: %d%n", file.getNameCount());
			System.out.format("subpath(0,2): %s%n", file.subpath(0, 2));
			System.out.format("getParent: %s%n", file.getParent());
			System.out.format("getRoot: %s%n", file.getRoot());

			boolean isRegularExecutableFile = Files.isRegularFile(file)
					& Files.isReadable(file) & Files.isExecutable(file);
			System.out.println(isRegularExecutableFile);

			Files.copy(file, tfile, REPLACE_EXISTING);
			Files.move(tfile, tfile2, REPLACE_EXISTING);
			Files.delete(tfile2);

			DosFileAttributes attr = Files.readAttributes(file, DosFileAttributes.class);

			System.out.println("isReadOnly is " + attr.isReadOnly());
			System.out.println("isHidden is " + attr.isHidden());
			System.out.println("isArchive is " + attr.isArchive());
			System.out.println("isSystem is " + attr.isSystem());

			System.out.println("creationTime: " + attr.creationTime());
			System.out.println("lastAccessTime: " + attr.lastAccessTime());
			System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

			System.out.println("isDirectory: " + attr.isDirectory());
			System.out.println("isOther: " + attr.isOther());
			System.out.println("isRegularFile: " + attr.isRegularFile());
			System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
			System.out.println("size: " + attr.size());

		} catch (NoSuchFileException x) {
			System.err.format("%s: no such" + " file or directory%n", file);
		} catch (DirectoryNotEmptyException x) {
			System.err.format("%s not empty%n", file);
		} catch (IOException x) {
			// File permission problems are caught here.
			System.err.println(x);
		} catch (UnsupportedOperationException x) {
		    System.err.println("DOS file" + " attributes not supported:" + x);
		}    
		Charset charset = Charset.forName("US-ASCII");
		
			
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
			 String line = null;
			    while ((line = reader.readLine()) != null) {
			        System.out.println(line);
			    }
			} catch (IOException x) {
			    System.err.format("IOException: %s%n", x);
			}
		
		String s = "\n This is a new line added to a file by program";
		
		try (BufferedWriter writer = Files.newBufferedWriter(file, charset, APPEND) ) {
		    writer.write(s, 0, s.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}

}
*/
=======
///**
//
//Byte Streams
//	InputStream( Files.newInputStream)
//	      InputStreamReader
//		FileInputStream
//			BufferedInputStream
//				DataInoutStream
//
//
//
//	OutputStream ( Files.newOuputStream)
//	     OutputStreamWriter
//		FileOutputStream
//			BufferedOutputStream
//				DataOutputStream
//
//
//
//
//Byte streams should only be used for the most primitive I/O
//All other streams built on byte streams.
//
//Character streams are often "wrappers" for byte streams. The character stream uses the byte stream to perform the physical I/O, while the character stream handles translation between characters and bytes. FileReader, for example, uses FileInputStream, while FileWriter uses FileOutputStream.
//
//
//Character Streams
//	Reader
//		FileReader
//			BufferedReader (Files.newBufferedReader )
//
//
//
//ByteChannel
//	SeekableByteChannel ( Files.newByteChannel)
//		FileChannel
//
//
//	Writer
//		FileWriter
//			PrintWriter
//			BufferedWriter (Files.newBufferedWriter)
//
//
//
//
//File I/O Methods Arranged from Less Complex to More Complex
//
//
//The flush method is valid on any output stream, but has no effect unless the stream is buffered
//
//InputStreamReader
//
//
//OutputStreamWriter
//
//read
//readLine
//
//
//write
//println
//
//close
//flush.
//exit
//
//The scanner API breaks input into individual tokens associated with bits of data.
//	hasNext,
//	next
//
//The formatting API assembles data into nicely formatted, human-readable form.
//
//	Elements of a Format Specifier.
//
//Conversions:
//	• d formats an integer value as a decimal value.
//	• f formats a floating point value as a decimal value.
//	• n outputs a platform-specific line terminator.
//	• x formats an integer as a hexadecimal value.
//	• s formats any value as a string.
//	• tB formats an integer as a locale-specific month name.
//
//Pasted from <http://docs.oracle.com/javase/tutorial/essential/io/formatting.html>
//
//	 System.out.format("%f, %1$+020.10f %n", Math.PI);
//
//DataStreams
//
//DataStreams uses one very bad programming technique: it uses floating point numbers to represent monetary values. In general, floating point is bad for precise values. It's particularly bad for decimal fractions, because common values (such as 0.1) do not have a binary representation.
//The correct type to use for currency values is java.math.BigDecimal. Unfortunately, BigDecimal is an object type, so it won't work with data streams. However, BigDecimal will work with object streams, which are covered in the next section.
//
//
//
//Just as data streams support I/O of primitive data types, object streams support I/O of objects. Most, but not all, standard classes support serialization of their objects. Those that do implement the marker interface Serializable.
//
//
//
//ObjectStream can contain a mixture of primitive and object values
//
//
//
//
//
//
//
//• preVisitDirectory – Invoked before a directory's entries are visited.
//• postVisitDirectory – Invoked after all the entries in a directory are visited. If any errors are encountered, the specific exception is passed to the method.
//• visitFile – Invoked on the file being visited. The file's BasicFileAttributes is passed to the method, or you can use the file attributes package to read a specific set of attributes. For example, you can choose to read the file's DosFileAttributeView to determine if the file has the "hidden" bit set.
//• visitFileFailed – Invoked when the file cannot be accessed. The specific exception is passed to the method. You can choose whether to throw the exception, print it to the console or a log file, and so on.
//
//
//
//• CONTINUE – Indicates that the file walking should continue. If the preVisitDirectory method returns CONTINUE, the directory is visited.
//• TERMINATE – Immediately aborts the file walking. No further file walking methods are invoked after this value is returned.
//• SKIP_SUBTREE – When preVisitDirectory returns this value, the specified directory and its subdirectories are skipped. This branch is "pruned out" of the tree.
//• SKIP_SIBLINGS – When preVisitDirectory returns this value, the specified directory is not visited, postVisitDirectory is not invoked, and no further unvisited siblings are visited. If returned from the postVisitDirectory method, no further siblings are visited. Essentially, nothing further happens in the specified directory.
//
//
//
//public FileVisitResult
//     preVisitDirectory(Path dir,
//         BasicFileAttributes attrs) {
//    (if (dir.getFileName().toString().equals("SCCS")) {
//         return SKIP_SUBTREE;
//    }
//    return CONTINUE;
//}
//
//Finder finder = new Finder(pattern);
//Path startingDir = ...;
//Files.walkFileTree(startingDir, opts, Integer.MAX_VALUE, finder);
//
//
//
// *
// */
//
//
///**
// * @author rmudiga
// *
// */
//import static java.nio.file.StandardOpenOption.*;
//
//import java.nio.ByteBuffer;
//import java.nio.channels.*;
//import java.nio.file.*;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.io.*;
//import java.nio.charset.Charset;
//import static java.nio.file.FileVisitResult.*;
//
//public   class PrintFiles
//extends SimpleFileVisitor<Path> {
//
//// Print information about
//// each type of file.
//@Override
//public FileVisitResult visitFile(Path file,
//                               BasicFileAttributes attr) {
//    if (attr.isSymbolicLink()) {
//        System.out.format("Symbolic link: %s ", file);
//    } else if (attr.isRegularFile()) {
//        System.out.format("Regular file: %s ", file);
//    } else {
//        System.out.format("Other: %s ", file);
//    }
//    System.out.println("(" + attr.size() + "bytes)");
//    return CONTINUE;
//}
//
//// Print each directory visited.
//@Override
//public FileVisitResult postVisitDirectory(Path dir,
//                                      IOException exc) {
//    System.out.format("Directory: %s%n", dir);
//    return CONTINUE;
//}
//
//// If there is some error accessing
//// the file, let the user know.
//// If you don't override this method
//// and an error occurs, an IOException
//// is thrown.
//@Override
//public FileVisitResult visitFileFailed(Path file,
//                                   IOException exc) {
//    System.err.println(exc);
//    return CONTINUE;
//}
//
//public static void main(String args[]){
//	System.out.println(" File traversing Started ..... \n");
//
//	Path startingDir = Paths.get("C:\\Work\\mrvsr");
//	PrintFiles pf = new PrintFiles();
//	try{
//	Files.walkFileTree(startingDir, pf);
//	} catch( Exception e){
//		System.out.println(e.toString());
//	}
//
//}
//}
///********************/
//
///**
// *
// */
//
//
///**
// * @author rmudiga
// *
// */
//import static java.nio.file.StandardOpenOption.*;
//
//import java.nio.ByteBuffer;
//import java.nio.channels.*;
//import java.nio.file.*;
//import java.io.*;
//import java.nio.charset.Charset;
// class DirTest {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
//		for (Path name: dirs) {
//		    System.err.println(name);
//		}
//
//		Path dir = Paths.get("C:\\Work\\mrvsr");
//		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
//		    for (Path file: stream) {
//		        System.out.println(file.toString());
//		    }
//		} catch (IOException | DirectoryIteratorException x) {
//		    // IOException can never be thrown by the iteration.
//		    // In this snippet, it can only be thrown by newDirectoryStream.
//		    System.err.println(x);
//		}
//
//	}
//}
///***********************************/
//
///**
// *
// */
//
//
///**
// * @author rmudiga
// *
// */
//import static java.nio.file.StandardOpenOption.*;
//
//import java.nio.ByteBuffer;
//import java.nio.channels.*;
//import java.nio.file.*;
//import java.io.*;
//import java.nio.charset.Charset;
//
//public class LogFileTest {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String s = "Hello World !";
//		byte data[] = s.getBytes();
//		Path p = Paths.get("c:\\work\\mrvsr\\javatestwrite.txt");
//
//		try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE,APPEND))){
//			out.write(data,0,data.length);
//		} catch (IOException x){
//			System.err.println(x);
//		}
//
//		try (SeekableByteChannel sbc = Files.newByteChannel(p)){
//			ByteBuffer buf = ByteBuffer.allocate(10);
//
//			String encoding = System.getProperty("file.encoding");
//			while (sbc.read(buf) > 0){
//				buf.rewind();
//				System.out.println(Charset.forName(encoding).decode(buf));
//				buf.flip();
//			}
//
//		}catch (IOException x) {
//		    System.out.println("caught exception: " + x);
//		}
//
//	}
//
//}
///**************************/
//
//
///**
// *
//
// **/
//import java.nio.file.*;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.nio.file.attribute.DosFileAttributes;
//
//import static java.nio.file.StandardCopyOption.*;
//import static java.nio.file.StandardOpenOption.*;
//import java.nio.charset.*;
//import java.io.*;
//
///**
// * @author rmudiga
// *
// */
//public class PathTest {
//	/**
//	 *
//	 */
//	public PathTest() {
//		// TODO Auto-generated constructor stub
//		System.out.println("test");
//	}
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Path file = Paths.get("C:\\Work\\javatest.txt");
//		Path tfile = Paths.get("C:\\Work\\javatest_copy.txt");
//		Path tfile2 = Paths.get("C:\\Work\\javatest_move.txt");
//		try {
//
//			System.out.format("toString: %s%n", file.toString());
//			System.out.format("getFileName: %s%n", file.getFileName());
//			System.out.format("getName(0): %s%n", file.getName(0));
//			System.out.format("getNameCount: %d%n", file.getNameCount());
//			System.out.format("subpath(0,2): %s%n", file.subpath(0, 2));
//			System.out.format("getParent: %s%n", file.getParent());
//			System.out.format("getRoot: %s%n", file.getRoot());
//
//			boolean isRegularExecutableFile = Files.isRegularFile(file)
//					& Files.isReadable(file) & Files.isExecutable(file);
//			System.out.println(isRegularExecutableFile);
//
//			Files.copy(file, tfile, REPLACE_EXISTING);
//			Files.move(tfile, tfile2, REPLACE_EXISTING);
//			Files.delete(tfile2);
//
//			DosFileAttributes attr = Files.readAttributes(file, DosFileAttributes.class);
//
//			System.out.println("isReadOnly is " + attr.isReadOnly());
//			System.out.println("isHidden is " + attr.isHidden());
//			System.out.println("isArchive is " + attr.isArchive());
//			System.out.println("isSystem is " + attr.isSystem());
//
//			System.out.println("creationTime: " + attr.creationTime());
//			System.out.println("lastAccessTime: " + attr.lastAccessTime());
//			System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
//
//			System.out.println("isDirectory: " + attr.isDirectory());
//			System.out.println("isOther: " + attr.isOther());
//			System.out.println("isRegularFile: " + attr.isRegularFile());
//			System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
//			System.out.println("size: " + attr.size());
//
//		} catch (NoSuchFileException x) {
//			System.err.format("%s: no such" + " file or directory%n", file);
//		} catch (DirectoryNotEmptyException x) {
//			System.err.format("%s not empty%n", file);
//		} catch (IOException x) {
//			// File permission problems are caught here.
//			System.err.println(x);
//		} catch (UnsupportedOperationException x) {
//		    System.err.println("DOS file" + " attributes not supported:" + x);
//		}
//		Charset charset = Charset.forName("US-ASCII");
//
//
//		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
//			 String line = null;
//			    while ((line = reader.readLine()) != null) {
//			        System.out.println(line);
//			    }
//			} catch (IOException x) {
//			    System.err.format("IOException: %s%n", x);
//			}
//
//		String s = "\n This is a new line added to a file by program";
//
//		try (BufferedWriter writer = Files.newBufferedWriter(file, charset, APPEND) ) {
//		    writer.write(s, 0, s.length());
//		} catch (IOException x) {
//		    System.err.format("IOException: %s%n", x);
//		}
//	}
//
//}
>>>>>>> cb3866775a23308bae8fd52663ae4e0bbc2db8fe
