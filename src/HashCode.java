import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
							 
							


public class HashCode {
	
	int totalTime = 0;
	int numb_intersections =0;
	int numb_streets = 0;
	int numb_cars = 0;
	int bonus = 0;
			
	HashMap<String, Street> streets = new HashMap<String, Street>();
	Car cars[];

	public static void main(String[] args) {
		String[] inputs = new String[]{"a"};

        for (String fileName : inputs) {
        	System.out.println("*************" + fileName);
        	HashCode hashCode = new HashCode();
        	hashCode.readInputFile(fileName + ".txt");
        	hashCode.doLogic();
        	hashCode.saveToOutputFile(fileName );
        }

	}
	
	private void readInputFile(String inputFileName) {
    	final String methodName = "readInputFile";
        System.out.println(System.currentTimeMillis()+ " Start " + methodName);
         
        BufferedReader bufferedReader = null;
        try {
			bufferedReader = new BufferedReader(new FileReader("input/" + inputFileName));
			int lineNumber = 0;
											
								   
			//First line
															  
																	
																	 
																		
											 
			String line = bufferedReader.readLine();
			String[] lineSpiltArray = line.split(" ");

			totalTime = Integer.parseInt(lineSpiltArray[0]);
			numb_intersections = Integer.parseInt(lineSpiltArray[1]);
			numb_streets = Integer.parseInt(lineSpiltArray[2]);
			numb_cars = Integer.parseInt(lineSpiltArray[3]);
			bonus = Integer.parseInt(lineSpiltArray[4]);

			//read streets
			for (int i = 0; i < numb_streets; i++) {
				line = bufferedReader.readLine();
				lineSpiltArray = line.split(" ");
				Street street = new Street();
				street.setStartInt(Integer.parseInt(lineSpiltArray[0]));
				street.setEndInt(Integer.parseInt(lineSpiltArray[1]));
				street.setName(lineSpiltArray[2]);
				street.setDuration(Integer.parseInt(lineSpiltArray[3]));
				streets.put(lineSpiltArray[2], street);
			}
			
			
			
			cars = new Car[numb_cars];
			//read cars
			for (int i = 0; i < numb_cars; i++) {
				line = bufferedReader.readLine();
				lineSpiltArray = line.split(" ");
				Car x = new Car(lineSpiltArray.length - 1);
				for (int j = 1; j < lineSpiltArray.length; j++) {
					x.addStreet(lineSpiltArray[j]);
				}
				x.calculateRating(streets);
				cars[i] = x;
			}
			
			for (int i = 0; i < cars.length; i++) {
				System.out.println(cars[i].getRating());
			}
			System.out.println(Car.getMaxCarScore());
			
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
        
        // order the cars based on the length of their path (Maybe when the input is read)
//      Collections.sort(carList, new Comparator<Car>() {
//			  public int compare(Car l2, Car l1) {
//				  return l1.getScore()- l2.getScore();
//			  }
//		 });
        
        //Max_car_score
        // calculate score for each street
        // street_score += (Max_car_score - car_score) for a car with the street on their path
        for (int i = 0; i < carList.size(); i ++) {
        	Car car = carList[i];
        	for (int j;  j < car.getPath().size(); i ++) {
        		street_str = car.getPath()[j];
        	
        		//get street object from streetsHash
        		street.Score += Max_car_score-car.getScore()
        		
        	}
        	
        	
        }
        // Make schedule using the street scores
        // Streets with less score get more open time.
        
        
        
        
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
