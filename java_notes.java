{updating java: run uninstaller then uninstall in window's program

----Java 8 update-----
set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_{update number}
setx JAVA_HOME "%JAVA_HOME%" /M
setx PATH ^%JAVA_HOME^%\bin;"%PATH%" /M

---Java 9xxx update----
set JAVA_HOME=C:\Program Files\Java\jdk-9.{minor version}.{update number}
setx JAVA_HOME "%JAVA_HOME%" /M

----windows-CMD-stuff----
chcp 65001   //for code page 850, ei display correct Italian text
}
{ Git
'fork' // create a branch	

git clone git@github.com:vvo2/fun-with-git.git
git remote //show remote URL
git remote -v //check stream
git remote set-url //change a URL
git remote rm origin git@github.com:vvo2/fun-with-git.git //remove history
git remote add origin git@github.com:vvo2/fun-with-git.git
git commit
git log // use Q for quit
git checkout branchName
git push //uncommitted change and set aside
git pull // pull the changes and merge
git stash pop //
}
{ --- ItelliJ --- Eclipse --- jshell --- JAR
ItelliJ // create package first before creating class. To clone repository from GitHub in intelliJ, select “Check out from Version Control”. Select GitHub, Open repository in GitHub, Select Download/Clone, Copy URI, Paste URI in “Git Repository URL” field
jshell -c out\production\"package name" //IJ complier output directory
import edu.cnm.deepdive.iteration.ClassName; //full qualified name
ClassName.methodName(parameter)

error loading *.iml from clone// click import project, browse for gradle.build file, check auto-import.

eclipse // github check initialize readme, clone repo, eclipse automatically paste SSH URI, create repository on github and clone in Eclipse's git repository and then create new project and DO NOT "use default location," -save work before scratch inspect -add git repository on an already written project: click "create" in git repository, then ignore red error and cancel, then right click in git repo "push master" and passphrase will be asked
jshell -c bin //run jshell in a current project directory, bin is eclipse compiler output directory 
import full.Qualified.ClassFile.methodName;

JAR // can run if have manifest
  create manifest
  jshell -c jarFileName.jar // run jar while in folder of jar file
java -cp filename.jar edu.cnm.deepdive.projectName.ClassName //run jar file
  
JDOC //save in project/doc
  in Tools menu > check module  project/docs/api
  in augument: -link https://docs.oracle.com/javase/7/docs/api/ -link https://and.more.docs/
  // {@link methodName()}
  // -bootclasspath C:\android\sdk\platforms\android-21\android.jar -link https://docs.oracle.com/javase/7/docs/api -linkoffline https://developer.android.com/reference C:\android\sdk\docs\reference
  

JUnit Test Case //right click on package > new > JUnit > browser for class
  @Test //test method
  @Before //Run before test
  @BeforeClass //Run once before ant tests

com.github.rholder:snowball-stemmer:1.3.0.581.1 // library link for maven

}
{ ----unsorted notes-----


insertion//

'loose coupling high cohesion' is good
native //not implement in a java code, implement in like DLL

(object side of equal sign) = (reference side of equal side)

0b001 binary, 0128 octa, 0x1fb hex, /u00ff char hex ///println() only print literal number base on decimel
'literal decimal' // double by default, float need f and long need L subfix
'assigned primitive' // can do negative value
'unassigned primitive' // can't do negative. char.
//int 0.5 = 0
'byte code' //is platform independent
'wrapper class'// (Object)>(Boolean Character Number(Byte Shor Int Long Float Double, NumberFormatException when false) implement serialized comparable). immutable, add will assign new object. valueOf() parse is static method. all but Char have constructor with String aug.
'cache object'// Byte Short Int Long -128 to 127 == true, <127 == false, Char 0-127, Float Double no cache. valueOf(10) return cache value 10.
'autobox' is primitive to reference variable 
'unboxing'// is wrapper to primitive, pass null throw NullPointer Integer and int will autobox, can not widen object Integer to Double
//long and Big decimal for no rounding
(CastType) (different, data, types)// ei (char) (charA + charB) charAB becomes an int so cast it back to Char.  byte = (byte) (byte + byte). cannot case boolean to primitive in Java. primitive will truncates. To retrieve from another type while in one type of array.
'object cast' // ((Subclass) superClassInstance).doSomething()

"%%" "//" // %% display %  // display /
"%,d" //  display decimal with , on every 3 digit
division 9/4=2  9%4=1 //remainder 1 // taraus algorithmic
operator pairs: +=  -=  *=  /=  %=  &=  |=  ^= 
// ie x-=100 is x=x-100, += work as concatenation

++i i++// pre-iterate and post-iterate, same result, except ++i prints "2" i++ prints "1" and become "2" afterward  

'predicate' // test something and return a boolean value
==//boolean to check identity quality, check reference is the same instance. same value different wrapper doesn't compile.
.equals //check comparable classes, which has the hashcode, same literal. same value different wrapper is false. override must be "boolean equals(Object obj)." Any non-refer reflexive symmetric transitive return true, consistent either true or false, null return false. must override hashcode if uses keys
true^true // result false, act as toggle switch

{}//block for code in a body
()//parameter, to pass data. on a method declaration the data return
[]//one-dim arrays one [] on type or name. multi-dim just [] total
<>//use for java util

Upper Camel Case // class and interface uses UpperCamelCase 
lower Camel Case // method, field, local variable uses lowerCamelCase
SCREAMING SNAKE CASE // final and fixed constants

package //ei edu.cnm.deepdive.prework, packages hierarchy is done by folders, always lower case. Hierarchy prevent conflict with the global packaging. java* com.sun com.oracle reserved
object //on the heap, pointed by a class. contain method that can be override: toString() return str@983475, hashcode(), equals(), getClass().
class // ClassName.JAVA must match exact with class ClassName. multi inheritance not allowed. can extend multi interface

'access modifier'//can't be more strict in an overriding method
private // private instance variable for private use in a method and made available thru accessor methods. accessible only in the enclosing class
package private // inherited by sub-class in same package. default if class is not define. 
protected //for all subclasses to have access. anything in the package can access
public // accessible to all, is default if not define. by default one public class

'nonaccess modifiers' 'scope & type modifier'
abstract // polymorphic benefit multiple inheritance, can't be instantiated.
strictfp //floating-point calc guarantees indentical on all platform, IEEE standard
final  //read only, no override. 'compile-time constant' value must be known (define & initialize) at the time of code compilation
static //scope of the entire class, method can call by the className or ref var, initialize, can shadow over member of same name, no override.
synchronized //
transient //
volatile // to becareful it can change


'return type' // can not be put before modifier
Void //return type the method does not return anything.

//order of run
static initializer, instance initializer, main method //last
//priority
initializer block, constructor, //initializer block can local var, instance and static var, define loop, conditional statement, try-catch-finally.

'method parameter' variable 'method argument' actual value passed
//method can become a type by using the method name, one arg per var. return zero or one variable, can return null for obj.

correct way to a rename is by right click 'refactor' -> 'rename'

public static void main(String[] args)//must have to run 
is written:
access_modifier  scope_&_type_modifier  method_type_or_Name (parameter aka signature) { body block of code aka the scope ;}

'instance variables' 'object field' (non-static) because their values are unique to each instance of a class, ie currentSpeed of a bike. ie ISBN of a book
'class variable' 'static variable' exactly one copy of this variable in existence, regardless of how many times the class has been instantiated. ei numGear in a bike. null reference wont throw exception;

{----Strings----
String.format("%s of %s", rank, suit ) //two %s are taking two parameter, look up string format Specifiers:
'regular expression (regex)'// is a string pattern for matching syntax. see LongList.java
String str = new String("Hello")//not yet in string pool, compare obj == false
String str3 = "hello" //index start at 0. is in string pool, same with println
string str4 = "hello" //refer same obj == true
//String is a class overloaded constructor, use operator like +
//unused string are automatically garbage collected
orginalStr.substring(2,4) //start index 2, end at 3. return new string
replace('C', '3')//creates new String as immutable rule, can't mix "" and ''
indexOf() // -1 is no match. math return index position
length() // method, unlike array call variable length
startWith() endWith() //accept only type String
(1+2+"str") "3str" (""+1+2+"str") "12str" ("str"+(1+2)) "str3" (null+"str") "nullstr"
final char value[] //final variable to store String obj

StringBuilder myArr[] = {new StringBuilder("Java"),new StringBuilder("Loop")}// initial capacity is 16. capacity of 16 append 16 = 16. capacity 16 + append 17 characters = 34. TrimToSize() value equal string length. NO trim() 
char value[] //non-final array to store
append(array, 1, 3) // from index 1, append 3 characters. append(new obj("obj"))
insert(1, array, 1, 3) // insert at 1 then same as append
deleteCharAt(2,4) //delete from 2 to 3
replace(2,4,"str") //from 2 to 3 with "str"
subSequence(2,4)//like subString but char sequence. no modify
}

System.out.println("hello" + "world"); //system.out is an object that encapsulates output. 
'encapsulation' 'information hiding' //prevent vulnerable invalid data, private field private member. hide exposure of inernal parts and object state
-1 // end of file for IO read()

'immutable' // ie passing a primitive value itself. String, Time (system class). Immutable objects ease concurrency programming.
'mutable' // ie passing object to method, arrays are mutable, StringBuilder

'stack memory' temporary memory, is always referenced in LIFO (Last-In-First-Out) order, each method have a stack, accessible only by its thread, contain local variables and references pointing to the heap, Xss to define memory size. 'stack overflow error' memory full is, can occur when invoke a method without end.
'heap memory' memorize intil app ends, divide by generations for garbage collection purpose, memory and object and string pool, gobally accessible, Xmx define memory size. OutOfMemoryError is Java 'Heap Space error'

{------ if else if, switch case & string , for loop, enhance for loop -------
//evaluates all condition until match
if(condition) //condition can assign= boolean. 
	statement; //skip to else with {}
else if(condition)//else if for multi condition
	statement;
else
	statement;

//compares the argument with case label. uses equal method
switch(x +  y){ // valid switch(expression)  numeric primitive value must be assigned and final. can use instance of an enum class. null String or wrapper throw NullPointerExc
	case w:	//accept Byte Short Int Char string Enum.(expression must be final)
	case x: statement sequence; //for w & x. duplicate case value compilation error
	  break; //end of cases before break otherwise fall through remainging code
    case y: //x 1 2 can be string. use wrapper type and direct enum value
	case 10/3: //decimal get discard
	  statement sequence
	  break; //fail safe
	default: //no case match, cases are like "states"
	  statement sequence;
    }// case input and GUI have to be separate
//input must limited possibilities defined at compile time
String command = "disconnect"; //string can be use in switch statement for more readability
switch(command){case "connect" case "disconnect"}
'extract string resource' //turn string into constant. right click refactor > extract

for loop must have ( ; ; )//(initialize; condition; iteration, callMethod() after statement block) all optional. multi declaration of same type (i=0, j=10; i<j; i++, j--). need (;;) to compile. 
declared variables inside for are only accessible in that for

for ( whatTo : fulFill  ) 'forEach' 'enhanced for-loop' //Java 5.0. automated look & prevent boundary error. read only, no initialize modify or filter of array & collection. (del remove), no index values, natural order iteration

}
{ while, do-while, break, break andGoTo, continue

//loop unaware numbers, repeat until some condition becomes false.
while(condition) { statement; } //do iteration before or after (condition)

//do-while will always loop at least one iteration.
do {statement;} while (condition)// do while at least ounce, condition check at end of loop
charInput = (char) system.in.read(); //get input
do {ignore = (char) system.in.read();} //collect unused characters
while (ignore != '\n');//because new line is a char

break //to terminate a loop early

for(;;){  //block chain breaks
blockOne { 
blockTwo  { //
blockThree {(condition) break BlockOne; //break and goto blockOne
            (condition) break BlockTwo; //          goto blockTwo
			(condition) break BlockThree;//         goto blockThree
           }statement;
          }statement;
         }statement; 
		}

(condition) continue;//skip to next iteration and continue looping

label: //won't compile with declaration unless in {}.

}
{ 'bits bitwise, buckets of bits'
//  10000000 = -127
//  11111111 = -1 

~   // reverse the bit
<<  // left shift.  multiply by 2 in bits
>>  // right shift. divide by 2 in bits
>>  // 11000000 >>  = 11110000 // >>2 signed shift	
>>> //11000000 >>> = 00110000 // >>>1 unsigned right shift

&   //   00001111
	// & 11111000  <the & filter
	// = 00001000  only 1 if both are 1
	
^   //   00001111
	// ^ 11111000 
	// = 11110111  only 0 if both are 0
	
|   //   00001111
	// | 11111000  only 1 if any are 1
	// = 11111111  
	
	(i & 1) //for even, power of 2

x &= 2  // x = x & 2
}
{ --- Arrays, switch case "string", ternary operator ---

resultName = BooleanExp ? evalTrue : evalFalse; //ternary operator won't compile w/out assign var compatible w/ eval. () is optional, won't complie non-booleanExp, won't compile without eval & must be the same or compatible type. cant {}
a ? (d?e:f) : b //  a ? b : (d?e:f)  is valid

arrays[] //object with collection of addresses 'pointer' to scalar value or primitive, index from 0, array index 0 count as 1 in length. size of array can be char or long. Declare, allocate, then initialize. all-in-1 multiArray[][]={{0,1},{3,4,5}} dont need new & type if declare includ. can initialized {null} but can't access
type arrayName[] = {val1, val2, val3, valN}//java automatically allocate the size. no need to use the new operator
int[][] data = new int[3][7]; //must allocate after new int or less, 1st [] as row & 2nd [] as column. atleast 1st int[3][]. expression is valid [Math.max(2,3)]. array element default null \u0000 0 0.0 false.
.length //public immutable member of array, the length of an array
MyInterface[] array={ClassImplemented} MyAbstractClass[] {ClassExtended}

varargsName(int a, double b, int ... valsName)// ... valsName must be last, 1 per method, valsName is variable-length parameter name. ambiguous overloading when signature is not unique. 

}
{---- date & time ----
.now() .parse() //use in both Date and Time. parse method call in DateTimeFormatter. parse(dateOrTime, dateTimeFormatter), parse year ofPattern("yyyy") 
.getXX() .withXX //xx is DayOfMonth DayOfWeek DayOfYear Month MonthValue Year. Hour Minute Second Nano. withXX alter w/ int value.
.isAfter .isBefore // chronologic return true false. no isOn
.minusXX() .plusXX() // xx is long Days Weeks Months Years, TemperalAmount, period. Hours Minutes Seconds Nanos. recalculated
'DateTimeParseException'// .parse() & .of() invalid format. 9999-12-31

LocalDate.of(y, m, d) //store dates. accept Enum months. Jan is int 0 until Java 8+ Jan is int 1. don't need digit placeholder
.atTime(hr, min, sec, nsec)//can combine date ie date.atTime(17, 38)

LocalTime.of(hr, min, sec, nsec) //store time. 24hr. don't need digit placeholder. out of range RunTimeExc
'DateTimeException'// .atTime() .of() out of range
.toEpochDay 'epoch date' 1-1-1970, 00:00:00 GMT
.MIN .MIDNIGHT '00:00' equals true  .NOON '12:00' .MAX '23:59:59.999999999'
.atDate(date) // combine to LocalTime, time.date

LocalDateTime // 2018-07-10T13:24:30:908765

Duration // time base
Period.of(y, m, d) .ofYears(y) .ofMonths(m) .ofWeeks(w) .ofDays(d) // implements TemperalAmount + - no affect unless using plus() minus().  .plus(Period.ofMonths(1) is next month.
.parse(XX) // PnYnMnD Y M D or PnW; n is number. individual no recalculate. invalid str complie runtime error. 
.between (startDate, endDate) // 1st date include 2nd exclude
.getXX()// get Y M D from period
.isZero .isNegative // checks. negative if all
.minusXX .plusXX // individual no recalculate period. getXX minusXX & plusXX is plural.
.multipliedBy(int) // mult individual
.toTotalMonths // Period.of(1,5, 9).toTotalMonths

DateTimeFormatter.ofLocalizedXX(FormatStyle.xx) //Date Time DateTime(SHORT MEDIUM LONG FULL) short: 7/16/18 full: Saturday, July 16, 2018. predefined: BASIC_ISO_DATE  ISO_xx  ISO_LOCALE_xx  DATE TIME DATE_TIME.
.ofPattern("'custom text 'yyyy-MM-dd")//parse define symbol YMDdEeahHms`. "Y M D"  2020 8 223.  
format(DateTimeFormatter) //from Local Date/Time, return string
format(TemperalAccessor) //from DateTimeFormatter, return string
  formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)  //set style
  date = LocalDate.of(2020, 8, 30)  //set date
  formatter.format(date) //apply format to date. complies with RuntimeException 
}
{ Class, method, object, new, abstract, dot(.)operator, return, 
class vehicle // the top class
int mpg, fuelcap, passengers //instance variables, often in a fields
//defining a method is teaching the trick. invoke a method is doing the trick. Method have parameter, can change the states of the object.  
//created attribute and behavior apply to ALL the class (unless override)
class vehicleMethod //method (inside of class vehicle) to declared objects
Minivan, SportCar //object
Vehicle minivan = new Vehicle();//"new" operator to create objects
//referenceName objectName = create New object from Vehicle

minivan.fuelcap   sportCar.mpg
//dot (.) operator link object with the name of a member, on a null is a NullPointerException

return 'a void method' //will terminate from the method
return (double) miles / mpg; //to return from a method without void

'constructor' // initialize object with no return type no void, execute superclass then to sub-class. cannot be abstract final static. only one thread. is not a method. can't invoke from a method except using new. use any access modifier. 1 constructor call per constructor, must this() as 1st statement not class name.
'constructor overload' //call another constructor must be 1st statement using 'this' cant use class name. may define with access level but must define by different arg list
methodName() {x=y;} //default constructor
methodName(int x, int y) {x=a;y=b;} //parameterized constructor
 
vehicle(int p, int f, int m)//this constructor has 3 parameters
    {passengers = p; fuelcap = p; mpg = m;}  
class vehicleDemo  //pass 3 arguments to minivan
    {vehicle minivan = new vehicle(7, 16, 21);}//constructor complete vehicle
	
this //refer to the current object, instance of the class, interface method and constant. can't use in static method

'Enumeration' /* representing all the possible values of a given type can have constructors, instance variables, method, implement interface; is always a */ static class final /* name of enum are default strings; 
2 restriction: can't inherit another class (can't be extended), can't be a superclass */ 

 public static enum-type[] value() //can get from all declared enum
 public static enum-type valueOf(String str) //take the string of one constant
 ordinal() //take int number order the constant declared
 compareTo() //compare ordinal value? output pos & neg value
 
 }
{ 
'signature' // methodName with number and order of parameter, ignore public private type of method,  override must be the same signature 
'syntax sugar' // sugar coded
'call by value' // primitive 
'call by reference' // object, signature will define which. 

SecureRandom // better than random
  
'passphrases' //much larger than password, can contain space
  
<--> File <--> IO STEAM <--> Reader Writer <--> Buffer Reader  Print Writer <-->
 //character-oriented stream for internationalize and easier maintain.
 close() //finally, after done with a file, release whats allocated otherwise "memory leaks." ensure buffer written to physical device  
 DataInputStrream DataOutputStream //a reader and writer for many primitive binary data 
 RandomAccessFile // read and write by the seek() pointer
 BufferedReader(new InputStreamReader (System.in))//read console character-based stream (char-base converted from (bytes stream))
 
  throw //is part of method declaration, a runtime key word, methodType name() throw ExceptionType {} 
  throw new TypeOfException()//manually throw exception. also need to catch
  try ()//FileInputStream, InputStreamReader, BufferedReader, declare implicitly final resource, JDK7+ will auto close.
  catch(ExcType | Exctype | ExcType exObjName) {} // use | for multi-catch otherwise one catch per exception type, can catch without try (), empty {} to ignore exception
  throw exObjName; // re-throw the exception that was thrown in exObjName
  finally{statement} //execute regardless of try/catch condition

Throwable exObjName //super class of all exception, catches all, use last in the chain
 'Exception' // to prevent abnormal program termination
    RuntimeException //
      Array & IndexOutOfBoundsException, NullPointerException, NumberFormatException
   'Checked Exception'// handle in code
      IOException //parent class or reading and writing
        FileNotFoundException   
 'Error'// problem can't recover from
   'unchecked exception' // handle by yourself
 
  NonIntResultException extend Exception // NonIntResultException (int a, int b) exception that store two int that result a non-integer

ob1.methodName(ob2) //pass ob1 up to methodName class and pass ob2 to parameter of methodName
'method overloading' // change return type only with parameter change (different position and number and type). name [] and ... not different. primitive pass to nearest. auto up-convert ei char to int. 
'recursion' // a method calling itself
static // class can call it, direct access to method and variable in their class, static initializer access before any object of its class created, without reference to any object, all instances of the class shares static variables, static block execute first. static do not have (this) reference, can't override static, static cannot access non-static member of a class.
'non static' // method can access static member of a class.
'nested class' // static, access member of its outer class thru object reference 
'inner class' // non-static

extends //inherit members from a superclass, allow object reference between the classes, private members restriction does not overrule. superclass have a at least one method for sub-class to inherit
'getters and setters' 'mutator and accessor' // invoke private into public for consumer access
     void setObjName(type n){name=n;} //set
	 type getObjName(){return ObjName}//get

'superclass' //aka base & parent class. refer to next higher class, if superclass constructor requires parameters then subclasses must pass those "up the line"
super() //always the first statement in a sub-class constructor, to call superclass constructor. can't use in static method
super.memberName // to refer a member in superclass
super(Obj) //pass Obj up to the superclass
'IS-A relationship'// Programmer IS-A Employee, Manager IS-A Employee
'subclass'//aka derived extended & child class. can't access private of superclass.

'override'//overwrite, sub-class overwrite a method of the matching signature 
	'covariant return type' //return overid
'dynamic method dispatch'//multi override of a class, one-interface multi-method aspect of polymorphism, allow sub-class to define its own method

abstract class //super class can define abstract class w/out define abstract method. often for superclass to prevent instantiate, cannot use new, must be extended. can't create as an obj
abstract method // has no body, method must be overridden, must be in an abstract class or interface, implements all abstract method all the way to concrete subclass otherwise define as abstract derived class. call abstract method of interface must explicit public or won't compile.

interface// only contain field and abstract method signature so sub-class must implement. class implements interfaceName. interface extend interface. uses "adjective" words. cannot have state. can't create as obj.
'interface method'// implicitly public abstract class call must explicit plubic. Top-level only abstract or strictfp. Prior to Java 8 only define abstract method, Java 8 add default (aka defender, virtual extension) & static. cannot call using ref var of interfaceName nor the class that implemented. 1 method same name multi interface need prefix. multi method same name multi interface must same return type.
	default void method() {}// default behavior if no method call, can override (ei obj in interface to public Str in class, int to Integer won't compile). != abstract method, wont compile w/out {}. multi same name multi interface must override or won't compile.
	static method() {}// must call by interfaceName. class & interface not related, can have same name, doesn't hide or override the implement. allow multi same name multi interface regarless of return and signature
	only modified existing abstract to default will compiles.
'interface variable'//implicitly public, static, & final. won't compile private & protected var, message illegal combination of modifiers.

'polymorphic'// abstract class share inheritance. interface involves abstract default & define static but static never participate poly. overridden method from base to subclass. var bound at compile, method bound at runtime.

class<subintefaces<superinterface//rule in case of muli inheritance
baseInterface.super.getName()//
'functional interface' //has exactly one unimplemented method

Closeable extend AutoCloseable// (project/deepdive-interface)
compareTo extend Comparable // comparable knows to compare itself
Comparator // compare known how to compare two object similar or compatible type
Iterable //

<> //deal specific type
HashMap<TypeKey,TypeValue> //implement class from Map interface, container type, store key-value
Hashtable  //thread safe read and write, cannot store null

'Standard Library'
java.util.Collection<E> // is a group of object, forEach iteration is often use. List Map Set Queue 
  add; contains; clear; remove; size; 
java.util.List // extends Collection, ordered sequence of values (object), editable
  
linkList<> // cost of the proportion in the list
  
ArrayList<type> name = new ArrayList<type>()//implement interface List and all list operation (add, modify, delete, iterate). allow duplicate value added. maintain inserted order & return that order by Iterator ListIterator enchanced for. support generic, type safe, need declaration of type to add but Java 7+ allow declare just left side of =.
arrayList.add(pos, var)// insert and shift the rest right. ensureCapacity(size + 1) elementData[size++]
	.add(pos, anotherArraylist")//arraylist in an arraylist
	.set(pos, var)// modify
	.remove(pos) .remove(obj) //calls equals() before remove. StringBuilder & obj !=
	.size()// return number of element in the list
	.get(pos) //element at that pos. check pos exist within range of size()
	.contain(obj) .indexOf(obj) .lastIndexOf(obj) //match variable except String pool
	'shallow copy' //clone arrayList new instance but element are reference
	.clone //return type obj, need cast back 
    .toArray//return complete clone
ArrayList<ArrayList<String>> arrayListNest

PriorityQueue
HashMap<> //create map and use key to index, access quickly for very large list
Map<> //lookup and map out values
  
org.junit.jupiter.api.Assertions; //
   -ea //in VM
   
'Threading & synchronization' //sync for variable consistency.
'tread safe' stringBuffer, vector, hashTable
Async

Knuth shuffle, fisher yeat shuffle 
'bubble sort' //general, inefficient for large array.
'Merge Sort' //split sort and merge. require space as much at item you have.
Quicksort//done in place, partitioning in sorting, n square, not good sorting reversed order. 

Set<> // no duplicate, will overwrite duplicate

Show() // code still continues
showWait() //halt code

anonymous class //variable declare final in local field.

Data time//
}
{ 'Generic'  //bundle of types
//cannot use primitive type, complier substitute the necessary casts, only one version of Gen exist in the program,
'erasure' //compiler remove generic type info 
'Generic class' //bundle types


lamda// only work for functional interface with one un-implemented abstract method
//in Stream
() -> {} //

'shallow copy'
'deep copy'

'transient variable' //not be serialized
JWT //java web token, authorization header from any http request, base 64 encoded json obj with plain and hash info about you.
}
{ Spring framework java Spring boot (project/diceware-rest) //dependency 
'Spring boot "REST" //framework, http back end serverlet (with Tomcat) & server 
@RestController()  // place above class
@RequestMapping(value = "/diceware/raw", method = RequestMethod.GET) // base url endpoint, allow GET method only
@RequestParam(value = "string", defaultValue = "") //place inside () and left of parameter

'Artifact' // project structure > add jar > browse for main method from project.
'build artifact'

Spring Maven manifest // 
restful // does not change the states
REST //use  of HTTP methods
GET // nullipotent
POST //
PUT // idempotent
DELETE // idempotent
PATCH //
HEAD // nullipotent
}
{ ---- Swing ---- [deep-dive-rps-swingui]
	
}
