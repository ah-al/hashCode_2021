import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class HashCode {

	public static void main(String[] args) {
		String[] inputs = new String[]{"d"};

        for (String fileName : inputs) {
        	System.out.println("*************" + fileName);
        	HashCode hashCode = new HashCode();
        	hashCode.readInputFile(fileName + ".txt");
        	hashCode.doLogic();
        	hashCode.saveToOutputFile(fileName);
        }

	}
	
	private void readInputFile(String inputFileName) {
    	final String methodName = "readInputFile";
        System.out.println(System.currentTimeMillis()+ " Start " + methodName);
         
        BufferedReader bufferedReader = null;
        try {
        	bufferedReader = new BufferedReader(new FileReader("input/" + inputFileName));
            int lineNumber = 0;
            while (bufferedReader.ready()) {
            	if (lineNumber == 0) {
                    String line = bufferedReader.readLine();
                    String[] lineSpiltArray = line.split(" ");
//                    booksNo = Integer.parseInt(lineSpiltArray[0]);
//                    libaryNo = Integer.parseInt(lineSpiltArray[1]);
//                    dayScanning = Integer.parseInt(lineSpiltArray[2]);
                } else if (lineNumber == 1) {
                    String line = bufferedReader.readLine();
                    String[] lineSpiltArray = line.split(" ");
//                    for (int i = 0; i < lineSpiltArray.length; i++) {
//						bookList.add(new Book(i,Integer.valueOf(lineSpiltArray[i])));
//					}
                } else {
//                    for (int j = 0; j < libaryNo; j++) {
//                        String line = bufferedReader.readLine();
//                        String[] lineSpiltArray = line.split(" ");
//                        libList.add(new Library(j, Integer.valueOf(lineSpiltArray[0]),Integer.valueOf(lineSpiltArray[1]),Integer.valueOf(lineSpiltArray[2])));
//                        
//                        
//                        line = bufferedReader.readLine();
//                        lineSpiltArray = line.split(" ");
//                        
//                        for (int i = 0; i < lineSpiltArray.length; i++) {
//                        	bookList.get(Integer.parseInt(lineSpiltArray[i])).addLibrary(j, libList.get(j));
//                        	libList.get(j).addBook(bookList.get(Integer.parseInt(lineSpiltArray[i])));
//                        	//// parseinput
//                        }
//                        
//                        Collections.sort(libList.get(j).getBooksList(), new Comparator<Book>() {
//              			  public int compare(Book b2, Book b1) {
//              				  return b1.value - b2.value;
//              			  }
//              		 });
                        
//        			}
                }
                lineNumber++;
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                	bufferedReader.close();
                } catch (Exception ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
        
        System.out.println(System.currentTimeMillis()+ " End " + methodName);
	}
	
	private void doLogic() {
    	final String methodName = "doLogic";
        System.out.println(System.currentTimeMillis()+ " Start " + methodName);
        
        
//       Hashcode 2020   
//        for (int i = 0; i < libList.size(); i++) {
//        	Library lib = libList.get(i);
//        	ArrayList<Book> bookList = lib.getBooksList();
//        	int score = 0;
//        	for (int j = 0; j < bookList.size(); j++) {
//        		Book book = bookList.get(j);
//        		score += book.value;
//			}
//        	
//        	lib.setScore(score);
//			
//		}
        
//        Collections.sort(libList, new Comparator<Library>() {
//			  public int compare(Library l2, Library l1) {
//				  return l1.getScore(dayScanning)- l2.getScore(dayScanning);
//			  }
//		 });
        
//        Collections.sort(libList, new Comparator<Library>() {
//			  public int compare(Library l2, Library l1) {
//				  return l1.getDScore(dayScanning)- l2.getDScore(dayScanning);
//			  }
//		 });
        
//        int i =0;
//	      
//        for (i = 0; i < libList.size() && dayScanning > 0; i++) {
//        	Library lib = libList.get(i);
//        	dayScanning -= lib.getSingupTime();
//        	ArrayList<Book> bookList = lib.getBooksList();
//        	Library scanedlib = new Library(lib.id);
//        	int bookNum = 0;
//        	for (int j = 0; j < dayScanning; j++) {
//        		for (int j2 = 0; j2 < lib.getMaxScanePerDay() && bookNum < bookList.size()  ; j2++) {
//        			Book book = bookList.get(bookNum);
//        			if (!book.done) {
//	        			book.done = true;
//	        			scanedlib.addBook(book);
//        			} else {
//        				j2--;
//        			}
//        			bookNum++;
//				}				
//			}
//        	lib.done = true;
//            
//            Collections.sort(libList, new Comparator<Library>() {
//  			  public int compare(Library l2, Library l1) {
//				  return l1.getDScore(dayScanning) - l2.getDScore(dayScanning);
//  			  }
//            });
//            
//        	
//        	if (scanedlib.getBooksList().size() > 0) {
//        		outputList.add(scanedlib);
//        	} else {
//            	dayScanning += lib.getSingupTime();
//
//        	}
//        }

        
        
        System.out.println(System.currentTimeMillis()+ " End " + methodName);

	}
	
	


	private void saveToOutputFile(String filename) {
    	final String methodName = "saveToOutputFile";
        System.out.println(System.currentTimeMillis()+ " Start " + methodName);
        
        try {
        	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output/" + filename + ".out"));
        	
//        	bufferedWriter.write(outputList.size() + "\n");
//        	
//            for (Library l : outputList) {
//            	bufferedWriter.write(String.format("%d %d\n", l.id, l.getBooksList().size()));
//            	l.getBooksList().stream().forEach(b -> {
//            		try {
//						bufferedWriter.write(String.format("%d ", b.id));
//					} catch (Exception e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//            	});
//            	bufferedWriter.write(String.format("\n"));
//
//            }
//        	
//            bufferedWriter.flush();
        } catch (Exception ex) {
            System.err.println("Err" + ex.getMessage());
        } finally {
           
        }
        
        System.out.println(System.currentTimeMillis()+ " End " + methodName);
    	System.out.println("END*************" + filename);

	}
	

}
