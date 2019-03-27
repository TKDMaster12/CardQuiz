package com.example.cardquiz;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class TriviaDB extends SQLiteOpenHelper {

    private static final String Database_name = "QuestionsTriviaQuiz.db";//NAME of database stored in Assets folder
    private static final String uid = "_id";//name of column1
    private static final String Question = "Question";//name of column2
    private static final String OptionA = "OptionA";//name of column3
    private static final String OptionB = "OptionB";//name of column4
    private static final String OptionC = "OptionC";//name of column5
    private static final String OptionD = "OptionD";//name of column6
    private static final String Answer = "Answer";//name of column7
    private static final int version = 10;//version of database signifies if there is any upgrade or not

    public TriviaDB(Context context) {//constructor
        super(context, Database_name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sportsTable = "CREATE TABLE sports (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String scienceTable = "CREATE TABLE science (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String mathsTable = "CREATE TABLE maths (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String inventionsTable = "CREATE TABLE inventions (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String generalTable = "CREATE TABLE general (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String englishTable = "CREATE TABLE english (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String currencyTable = "CREATE TABLE currency (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String computerTable = "CREATE TABLE computer (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String capitalsTable = "CREATE TABLE capitals (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        String booksTable = "CREATE TABLE books (_id INTEGER, Question TEXT, " +
                " OptionA TEXT, OptionB TEXT, OptionC TEXT, OptionD TEXT, Answer TEXT)";

        sqLiteDatabase.execSQL(booksTable);
        sqLiteDatabase.execSQL(capitalsTable);
        sqLiteDatabase.execSQL(computerTable);
        sqLiteDatabase.execSQL(currencyTable);
        sqLiteDatabase.execSQL(englishTable);
        sqLiteDatabase.execSQL(generalTable);
        sqLiteDatabase.execSQL(inventionsTable);
        sqLiteDatabase.execSQL(mathsTable);
        sqLiteDatabase.execSQL(scienceTable);
        sqLiteDatabase.execSQL(sportsTable);

        String Insert_Data = "INSERT INTO sports VALUES (1,'Subroto cup is associated with','Cricket','Football','Chess','Golf','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (2,'2014 FIFA World Cup was held in','London','Brazil','India','Germany','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (3,'2010 winter Olympics were held in','USA','Russia','Vancouver','Australia','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (4,'Wilson Jones is associated with','Hockey','Golf','Billiards','Air race','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (5,'The term Grand Slam is associated with','Cricket','Tennis','Boxing','Football','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (6,'Which county did Ravi Shastri play for','Glamorgan','Leicestershire','Gloucestershire','Lancashire','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (7,'First Indian to win the World Amateur Billiards title','Geet Sethi','Wilson Jones','Michael Ferreira','Manoj Kothari','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (8,'The term Googly is associated with','Cricket','Football','Badminton','Hockey','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (9,'Krishna Poonia is associated with','Football','Hockey','Chess','Athletics','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (10,'In 1924 the first winter Olympics was held in','Italy','France','Austria','Canada','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (11,'Ricky Ponting is also known as','The Rickster','Ponts','Ponter','Punter','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (12,'Ronaldo is associated with','Cricket','Football','Hockey','Tennis','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (13,'Nickname of Glenn McGrath is','Ooh Ahh','Penguin','Big Bird','Pigeon','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (14,'Mark Waugh is commonly called','Afganistan','Junior','Tugga','Julio','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (15,'India won its first Olympic hockey gold in','1928','1932','1936','1948','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (16,'Who won the 1993 \"King of the Ring\"','Owen Hart','Bret Hart','Edge','Mabel','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (17,'Yankee Stadium in New York is associated with','Cricket','Tennis','Boxing','Hockey','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (18,'Wankhede Stadium is at','New Delhi','Chennai','Mumbai','Kolkata','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (19,'1st ODI captain for India','Ajit Wadekar','Bishen Singh Bedi','Nawab Pataudi','Vinoo Mankad','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (20,'First hand glider was designed by','Leonardo DaVinci','The Wright brothers','Francis Rogallo','Galileo','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (21,'The ''Dronacharya Award'' is given to','Sportsmen','Coaches','Umpires','Sports Editors','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (22,'Term associated with chess','Pitcher','Deuce','Vulnerable','Gambit','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (23,'1st ODI match played in India at','New Delhi','Ahmedabad','Kolkata','Mumbai','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (24,'First youth Olympic games was held in','Japan','China','Singapore','North Korea','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO sports VALUES (25,'Hurlington stadium is associated with','Golf','Boxing','Cricket','Polo','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (1,'Electric bulb filament is made of','Copper','Aluminum','Lead','Tungsten','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (2,'Which of the following is used in pencils','Graphite','Silicon','Charcoal','Phosphorous','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (3,'The gas usually filled in the electric bulb is','Nitrogen','Hydrogen','Carbon dioxide','Oxygen','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (4,'Washing soda is the common name for','Sodium Carbonate','Calcium Bicarbonate','Sodium Bicarbonate','Calcium Carbonate','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (5,'Quartz crystals is chemically','Silicon Dioxide','Germanium Oxide','Sodium Silicate','Sulphur','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (6,'Not known as green house gas','Methane','Nitrous oxide','Carbon dioxide','Hydrogen','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (7,'Bromine is a','Black Solid','Red Liquid','Colourless Gas','Highly Inflammable Gas','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (8,'Hardest substance available on earth','Gold','Iron','Diamond','Platinum','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (9,'Tetraethyl lead is used as','Pain Killer','Fire Extinguisher','Mosquito Repellent','Petrol Additive','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (10,'Used as a lubricant','Graphite','Silica','Iron Oxide','Diamond','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (11,'The average salinity of sea water is','3%','3.50%','2.50%','2%','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (12,'Galvanised iron sheets have a coating of','Lead','Chromium','Zinc','Tin','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (13,'Fe, Co, Ni may best called as','Transition metals','Main group metals','Alkali metals','Rare metals','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (14,'Heavy water is','Deuterium oxide','PH7','Rain water','Tritium oxide','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (15,'The element common to all acids is','Hydrogen','Carbon','Sulphur','Oxygen','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (16,'Non stick cooking utensils are coated with','Black paint','PVC','Teflon','Polystyrene','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (17,'Monazite is an ore of','Titanium','Zirconium','Iron','Thorium','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (18,'Potassium nitrate is used in','Medicine','Fertilizer','Salt','Glass','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (19,'Soda water contains','Carbonic acid','Sulphuric acid','Carbon dioxide','Nitrous acid','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (20,'Most soluble in water is','Camphor','Sulphur','Common salt','Sugar','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (21,'Sodium metal is kept under','Petrol','Alcohol','Water','Kerosene','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (22,'What is laughing gas','Nitrous Oxide','Carbon monoxide','Sulphur dioxide','Hydrogen peroxide','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (23,'SPICE simulator was introduced in','1950s','1960s','1972s','1980s','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (24,'Who developed Yahoo','Dennis Ritchie','David Filo & Jerry Yang','Vint Cerf','Steve Case','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (25,'Motor NOT suitable for use as a DC machine','Permanent magnet motor','Series motor','Squirrel cage motor','Synchronous motor','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (26,'What frequency range is the High Frequency band','100 kHz','1 GHz','30 to 300 MHz','3 to 30 MHz','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (27,'DB'' computer abbreviation means','Database','Double Byte','Data Block','Driver Boot','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (28,'''.INI'' extension refers  to','Image file','System file','Hypertext related file','Image Color file','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (29,'''.TMP'' extension refers  to','Compressed Archive file','Image file','Temporary file','Audio file','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO science VALUES (30,'What does AM mean','Angelo marconi','Anno median','Amplitude modulation','Amperes','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (1,'The average of first 50 natural numbers is','25.3','25.5','25','12.25','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (2,'The number of 3-digit numbers divisible by 6','149','166','150','151','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (3,'106 × 106 – 94 × 94 =','2004','2400','1904','1906','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (4,'What is 121 times 11','1331','1313','1133','3131','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (5,'10001 – 101 =','1001','990','9990','9900','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (6,'Which is the odd one out of the following :4, 5, 10, 18, 34, 59, 95','5','10','18','34','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (7,'19 + ____ = 42','23','61','0','42','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (8,'20 is divisible by','1','3','7','None of these','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (9,'The square root of 0.0081 is','0.09','0.009','0.91','0.9','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (10,'The cube root of 1331 is','11','13','19','17','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (11,'All natural numbers and 0 are called the _______ numbers','whole','prime','integer','rational','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (12,'142 × 16 =','7222','2227','2722','2272','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (13,'4505 ÷ 5 =','901','910','190','109','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (14,'10003 – 999 =','4009','9004','9040','9400','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (15,'45% of 640 + 64% of 450 = _____ % of 1440','54','40','45','50','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (16,'3456 ÷ 12 ÷ 8 =','33.5','36.5','36','33','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (17,'839.093 + 31.005 – 136.048 =','734.5','734.05','724.05','None of these','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (18,'0.05 × 0.09 × 5 =','0.005','0.0225','0.025','0.225','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (19,'8/√_____ = 2','16','18','36','81','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (20,'90112 – 3123 =','86989','87099','93235','96989','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (21,'What percentage should be added to 40 to make it 50','15','25','75','80','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (22,'4.16 × 0.75 =','0.312','0.0312','3.12','31.2','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (23,'1, 9, 25, 49, ___','121','81','16','169','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (24,'561204 × 58 = ___× 55555','606','646','586','716','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (25,'If 6 is 50% of a number, what is the number','10','11','12','13','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO maths VALUES (26,'Least number to be added to 2600 to make it a perfect square','3','39','1','5','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (1,'Who invented the BALLPOINT PEN','Biro Brothers','Waterman Brothers','Bicc Brothers','Write Brothers','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (2,'What J. B. Dunlop invented','Pneumatic rubber tire','Automobile wheel rim','Rubber boot','Model airplanes','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (3,'Who discovered radioactive element radium','Isaac Newton','Albert Einstein','Benjamin Franklin','Marie Curie','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (4,'When was barb wire patented','1874','1840','1895','1900','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (5,'James Watt invented','Diving bell','Steam boat','Hot air balloon','steam engine','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (6,'Who invented Jet Engine','Sir Frank Whittle','Gottlieb Daimler','Roger Bacon','Lewis E. Waterman','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (7,'Invention caused many deaths while testing','Dynamite','Ladders','Race cars','Parachute','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (8,'Who invented Gunpowder','Sir Frank Whittle','Roger Bacon','Leo H Baekeland','Ferdinand Von','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (9,'Benjamin Franklin invented','Bifocal spectacles','Radio','Barometer','Hygrometer','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (10,'Joe McVicker invented','Silly Putty','Etch-A-Sketch','Lite-Brite','Play-Doh','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (11,'Who invented Gramophone','Michael Faraday','Fahrenheit','Graham Bell','Thomas Alva Edison','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (12,'When was the first lawn mower invented','1830','1854','1835','1849','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (13,'Physicist responsible for  ''Big Bang Theory''','Albert Einstein','Michael Skube','George Gamow','Roger Penrose','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (14,'Who invented the fountain pen','Waterman','Sir William Grove','Charles Kettering','George Fountain','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (15,'When was the first elevator built','1743','1740','1753','1763','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (16,'Enrico Fermi invented','X ray machine','Betatron','Cyclotron','Nuclear reactor','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (17,'Thomas Davenport invented','Screw propellor','Electric streetcar','Chesterfield','Sleeping (railway) car','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (18,'Elisha Otis invented','Brake used in  elevators','Jet Engine','Turbine','Hydraulic Crane','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (19,'Where was the yo-yo invented','France','United States','Philippines','England','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (20,'When were blue jeans invented','1900s','1860s','1870s','1850s','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (21,'Who invented Electric Generator','Alfred B. Nobel','Graham Bell','Michael Faraday','Alva Edison','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (22,'Transistor was invented in','1940s','1960s','1950s','1980s','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (23,'Karl Benz invented','Gasoline powered automobile','Streetcar','Glider','Steam turbine','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (24,'Bar code scanners were invented in','1940s','1950s','1970s','1960s','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO inventions VALUES (25,'Who invented Dynamite','Alexander Graham Bell','Benjamin Franklin','Thomas Alva Edison','Alfred B. Nobel','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (1,'Who is the father of Geometry','Aristotle','Euclid','Pythagoras','Kepler','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (2,'Who was known as Iron man of India','Ballabh Pant','Jawaharlal Nehru','Subhash Chandra Bose','Sardar Vallabhbhai Patel','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (3,'Jude Felix is  famous in','Volleyball','Tennis','Football','Hockey','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (4,'Where is the Railway Staff College located','Pune','Allahabad','Vadodara','Delhi','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (5,'The famous Dilwara Temples are situated in','Uttar Pradesh','Rajasthan','Maharashtra','Madhya Pradesh','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (6,'Amartya Sen is famous in','Biochemistry','Electronics','Economics','Geology','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (7,'Satyajit Ray is associated with','Classical music','Commercial art','Film Direction','Classical dance','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (8,'Founder of Haryak Dynasty','Ajatshatru','Harshvardhan','Bimbisar','Ghananand','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (9,'The Rowlatt Act was passed in','1905','1913','1919','1925','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (10,'A. Nageshwara Rao is associated with','Sports','Literature','Film Actor','Politics','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (11,'Jamini Roy was a famous','Producer','Painter','Dancer','Actor','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (12,'East India Association was set up in','1866','1857','1836','1885','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (13,'Who called Subhash Chandra Bose as Desh Nayak','Lala Lajpat Rai','Rabindranath Tagore','Mahatma Gandhi','Bal Gangadhar Tilak','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (14,'Not associated with the UNO','ILO','WHO','ASEAN','All of the above','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (15,'Sarojini Naidu was elected Congress President at','Haripura, 1938','Bombay, 1934','Madras Session, 1927','Kanpur Session ,1925','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (16,'The Halifax summit was that of','G-7 countries','Leaders of the NAM','Palestinian','Israeli leaders','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (17,'Office of the UN General Assembly is in','Vienna','New York','Paris','Zurich','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (18,'Indian Dyarchy was started by','Indian Council Act','Minto-Morley Reforms','Indian Council Act','Montague Reforms','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (19,'Ms. Vijaya Mehta is known for','Theatre','Film Direction','Classical Dance','Journalism','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (20,'Indian Institute of Science is located at','Kerala','Madras','Bangalore','New Delhi','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (21,'Electronic City of India','Mumbai','Hyderabad','Guragon','Bangalore','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (22,'Indian School of Mines is located in','Dhanbad','Asansol','Tatanagar','Rourkela','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (23,'Golden Temple is situated in','New Delhi','Agra','Amritsar','Mumbai','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (24,'Headquarters of the UNESCO is at','Rome','Geneva','New York','Paris','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO general VALUES (25,'UN body deals with population problem','UNFPA','UNDP','UNICEF','UNESCO','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (1,'Find the correctly spelt word','Adulation','Adlation','Aduletion','Addulation','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (2,'Find the correctly spelt word','Adulterate','Adeldurate','Adulterat','Adultarate','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (3,'Find the correctly spelt word','Adventitious','Adventitous','Adventitus','Adventituous','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (4,'Find the correctly spelt word','Adversity','Advercety','Adversity','Advercity','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (5,'Find the correctly spelt word','Affedevit','Afidevit','Affidevit','Affidavit','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (6,'Find the correctly spelt word','Agglomeration','Aglomeration','Agglomaration','Aglomaration','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (7,'Find the correctly spelt word','Cacophone','Cacophoney','Cacophoni','Cacophony','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (8,'Find the correctly spelt word','Centrefuge','Centrifuse','Centifuse','Centrifuge','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (9,'Find the correctly spelt word','Deference','Defferance','Defference','Defferince','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (10,'Find the correctly spelt word','livelihood','livelyhood','livlihood','livelyhud','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (11,'Find the correctly spelt word','foyere','foayer','foyer','fouyer','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (12,'Find the correctly spelt word','irelevant','irrelavent','irelevent','irrelevant','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (13,'Find the correctly spelt word','Uniquely','Internaly','Coldlly','Fortunatelly','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (14,'Find the correctly spelt word','Promiscuous','Promescuous','Promiscuos','Promescuous','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (15,'Find the correctly spelt word','Onomatopoeia','Onomotopoei','Onomatopoia','Onamotipoei','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (16,'Find the correctly spelt word','Millionair','Millionnaire','Milionaire','Millionaire','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (17,'Find the correctly spelt word','Sychological','Psychological','Psykological','Sykological','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (18,'Foremost','Hindmost','Unimportant','Disposed','Mature','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (19,'Protects','Defends','Deprives','Deserts','Devises','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (20,'Beautiful','Wonderful','Graceful','Ugly','Handsome','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (21,'Terrible','Soothing','Frightening','Scaring','Delectable','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (22,'Widely','Spaciously','Succinctly','Broad based','Narrowly','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (23,'Synonym of FOSTERING','Safeguarding','Neglecting','Ignoring','Nurturing','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (24,'Synonym of PROPEL','Drive','Jettison','Burst','Acclimatize','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (25,'Synonym of MASSIVE','Strong','Little','Gaping','Huge','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (26,'Synonym of STUMBLING BLOCK','Argument','Frustration','Advantage','Hurdle','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO english VALUES (27,'Synonym of DEFER','Indifferent','Defy','Differ','Postpone','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (1,'The currency of Afghanistan is','Afghani','Rupee','Ruble','Dinar','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (2,'The currency of Albania is','Dram','Lek','Manta','Dinar','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (3,'The currency of Algeria is','Franc','Dinar','Dollar','Suham','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (4,'The currency of Australia is','Australian Dollar','Euro','Manta','Franc','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (5,'The currency of Bangladesh is','Taka','Franc','Dollar','Peso','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (6,'The currency of Belgium is','Euro','Dollar','Dinar','Peso','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (7,'The currency of Bhutan is','Rupee','Franc','Dollar','Colon','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (8,'The currency of Bolivia is','Rupee','Boliviano','Dollar','Franc','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (9,'The currency of Brazil is','Pula','Real','Franc','Dollar','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (10,'The currency of Canada is','Pound','Dollar','Euro','Franc','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (11,'The currency of Cameroon is','Franc','Lev','Dollar','Dinar','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (12,'The currency of China is','Franc','Krone','Yuan','Kuna','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (13,'The currency of Colombia is','Franc','Peso','Pula','Dollar','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (14,'The currency of Cuba is','Kuna','Cuban Peso','Colon','Franc','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (15,'The currency of Creech Republic is','Koruna','Krone','Franc','Colon','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (16,'The currency of Denmark is','Colon','Yuan','Franc','Krone','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (17,'The currency of Egypt is','Birr','Franc','Pound','Marko','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (18,'The currency of Finland is','Dollar','Markka','Pound','Peso','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (19,'The currency of France is','French Franc','Dollar','Pound','Peru','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (20,'The currency of Germany is','Dollar','Pound','Peso','Mark','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (21,'The currency of Greece is','Cedi','Euro','Dollar','Peso','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (22,'The currency of Haiti is','Gourde','Rupee','Pound','Dollar','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (23,'The currency of Iceland is','Forint','Lira','Krona','Peso','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (24,'The currency of Ireland is','Dollar','Pound','Yen','Lira','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (25,'The currency of Israel is','Lira','New Shekel','Dollar','Pound','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (26,'The currency of Iraq is','Riyal','Dinar','Dollar','Dirham','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (27,'The currency of Japan is','Dollar','Lira','Yen','Dinar','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (28,'The currency of North Korea is','Won','Dollar','Pound','Euro','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (29,'The currency of Malaysia is','Kwacha','Ringit','Peso','Rupee','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (30,'The currency of Maldives is','Ringit','Ruffian','Franc','Lira','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (31,'The currency of Myanmar is','Metical','Dollar','Peso','Kyat','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (32,'The currency of Nepal is','Dollar','Dinar','Pound','Rupee','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (33,'The currency of Russia is','Leu','Rouble','Peso','Euro','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (34,'The currency of Saudi Arabia is','Dinar','Dirham','Franc','Riyal','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (35,'The currency of Spain is','Rand','Peseta','Guilder','Peso','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (36,'The currency of Sweden is','Krona','Dollar','Franc','Peseta','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (37,'The currency of Thailand is','Shilling','Togo','Peso','Baht','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (38,'The currency of United Kingdom is','Dollar','Pound','Euro','Franc','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (39,'The currency of India is','Indian Rupee','Pound','Dollar','Lira','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO currency VALUES (40,'The currency of USA is','Peso','Dollar','Pound','Som','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (1,'Protocol providing e-mail facility among different hosts','FTP','SMTP','TELNET','SNMP','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (2,'Basic architecture of computer was developed by','John Von Neumann','Charles Babbage','Blaise Pascal','Garden Moore','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (3,'In how many generations a computer can be classified','3','4','5','6','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (4,'Fifth generation computers are based on','Artificial Intelligence','Programming Intelligence','System Knowledge','VVLSI','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (5,'First generation of computer was based on','Transistor','LSI','VLSI','Vaccum Tube','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (6,'Second generation computers are made of','Vaccum Tubes','Transistors','LSI','VLSI','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (7,'Which of the following memory is non-volatile','SRAM','DRAM','ROM','All of the above','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (8,'GUI stands for','Graph Use Interface','Graphical User Interface','Graphical Unique Interface','None of these','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (9,'Time during which a job is processed by the computer is','Execution Time','Delay Time','Real Time','Waiting Time','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (10,'Circuit  used as a ''Memory device'' in computers','Rectifier','Flip Flop','Comparator','Attenuator','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (11,'An error is also known as','Bug','Debug','Cursor','Icon','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (12,'Microsoft Word is an example of','an operating system','Processing device','Application software','an input device','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (13,'Who invented the super computer','PT Fransworth','JH Van Tassell','Charles Ginsberg','Charles Babbage','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (14,'The size of commonly used floppy disk is','4.5','3.5','3.25','5.5','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (15,'The ''IC'' chip, used in computers, is made of','Chomium','Iron Oxide','Silica','Silicon','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (16,'Operating systems is produced by IBM','OS-2','Windows','DOS','UNIX','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (17,'Where is the headquarters of Intel located','Redmond, Washington','Tucson, Arizona','Santa Clara, California','Richmond, Virginia','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (18,'Window''s settings are recorded in','WINDOWS.INI','WIN.INI','SYSTEM.INI','GROUP.INI','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (19,'Which network protocol is used to send e-mail','FTP','SSH','POP3','SMTP','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (20,'Operating System is the most common type of _________ software','Communication','Application','System','Word Processing Software','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (21,'The operating system manages','Memory','Processor','Disk and I/O Devices','All of the above','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (22,'Which of the following memory is volatile','RAM','ROM','EPROM','PROM','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (23,'Which of the following is the fastest','Magnetic Tapes and Disks','CPU','Video Terminal','Sensors','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (24,'A kilobyte also referred to as KB, is equal to','1000 bytes','1024 bytes','2048 bytes','512 bytes','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (25,'Computer Virus is a _______','Hardware','Software','Bacteria','Freeware','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (26,'The most advanced form of ROM is','PROM','RAM','EEPROM','Cache Memory','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (27,'Another term for Main Memory is','Hard Disk','ROM','Floppy Disk','RAM','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (28,'One MB is equal to','1024 Byte','1024 KB','1000 KB','1024 GB','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (29,'Internet Explorer is a type of','Operating System','Browser','IP address','Compiler','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (30,'______ is the high speed memory used in the computer','RAM','Hard Disk','Cache','BIOS','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (31,'A collection of 8 bits is called','Byte','Record','Word','Nibble','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (32,'A list of instructions used by a computer is called','Text','CPU','Program','Output','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (33,'Nesting of if-else statements is allowed in C Programming','Yes','No','None of above','All of above','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (34,'For loop is _________','Function Controlled Loop','Exit Controlled Loop','Entry Controlled Loop','None of these','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (35,'An Assembler is used to translate a program written in','Low-Level Language','Machine Language','Assembly Language','High-Level language','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (36,'Which among following is an image name extension','gif','docx','ppt','lib','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (37,'Father of Artificial Intelligence _______','John McCarthy','Vint Cerf','Dennis Ritchie','ames Gosling','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (38,'Who invented Java','Deniss Ritche','James Gosling','Bajarnae','Linus Torvalds','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (39,'Which term is related to database','PHP','Java','Oracle','Assembly','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (40,'Which language was used as first generation language','Machine language','Assembly language','Java','C','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (41,'Where is cahce memory is located','CPU','Monitor','Scanner','On file server','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (42,'Which among following is odd one','RAM','ROM','Cache','Hard Disk','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (43,'Which operating system is developed by Apple','Linux','Window','Mac OS','DOS','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (44,'What is full form of RAM','Read Access Memory','Read Alternative Memory','Random Access Memory','Random Alternative Memory','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (45,'Computer resolution measures','Size of screen','Shape of screen','Number of pixels','Number of colours it support','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (46,'What is full form of CAM','Computer Aided Manufacturing','Computer And Manufacturing','Computer Aided Manifesto','Computer And Manifesto','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (47,'Which type of storage device is a BIOS','Primary','Secondary','Tertiary','Not a storage device','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (48,'One byte is equal to how many bits','4 bits','8 bits','12 bits','12 bits','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (49,'Who invented keyboard','James Gosling','Steve Jobs','Martin cooper','Christoper Latham Sholes','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (50,'What is meaning of OMR','Optical Mark Reader','Optical Message Reader','Optical Message Render','Optical Mark Render','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (51,'Who is also known as father of Jquery','Vint cerf','John Resig','Larry Page','Chales Babbage','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (52,'Who invented C++','Steve Jobs','James Gosling','Bjarne Stroustrup','Dennis Ritchie','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (53,'Which is odd one','Inkjet Printers','CRT','Laser Printers','Dot Matrix Printers','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (54,'IP address version 4 is in which format','4 bit','8 bit','16 bit','32 bit','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (55,'Which type of software is an operating system','Utility Software','System Software','Application Software','Firmware Software','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (56,'Which type of switching is used in Internet','Packet','Telephone','Circuit','Telex','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (57,'Component of computer  also considered as it Heart','Monitor','Keyboard','Scanner','Microprocessor','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (58,'What is used to make computer chips','Copper','Steel','Silicon','Iron','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (59,'Where BIOS is stored','Hard Disk','RAM','Flash Memory Chip','Any of above','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (60,'Random Access Memory (RAM) is which storage of device','Primay','Secondary','Teriary','Off line','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (61,'What is full form of SMPS','Switch Mode Power Supply','Simple Mode Power Supply','Storage Mode Power Supply','Storage Mode Power Shortage','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (62,'Where are saved files stored in computer','RAM','Hard disk','Cache','Any of above','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (63,'Which among following is odd','CD/DVD','Floopy Disks','SD Disk','BIOS','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (64,'Which operations are performed by RAM','Read','Write','Read and Write','Depends on computer','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (65,'USB is which type of storage device','Primay','Secondary','Tertiary','None of above','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (66,'Who was the Founder of Bluetooth','Ericson','Martin Cooper','Steve Jobs','Apple','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (67,'Who was the father of Internet','Chares Babbage','Vint Cerf','Denis Riche','Martin Cooper','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (68,'Verification is process of','Access','Login','Logout','Authentication','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (69,'What is LINUX','Malware','Operating System','Application Program','Firmware','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (70,'Which is most common language used in web designing','C','C++','PHP','HTML','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (71,'In which of the following form, data is stored in computer','Decimal','Binary','HexaDecimal','Octal','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (72,'Which of following is used in RAM','Conductor','Semi Conductor','Vaccum Tubes','Transistor','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (73,'Full form of GUI','Graphical user Instrument','Graphical unified Interface','Graphical user Interface','None of above','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (74,'What is full form of ALU','Arithmetic logic unit','Allowed logic unit','Ascii logic unit','Arithmetic least unit','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (75,'WWW stands for','World Whole Web','Wide World Web','Web World Wide','World Wide Web','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (76,'Where is RAM located','Expansion Board','External Drive','Mother Board','All of above','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (77,'Full form of URL','Uniform Resource Locator','Uniform Resource Link','Uniform Registered Link','Unified Resource Link','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (78,'The parity bit is added for the purpose of','Coding','Error detection','Controlling','Indexing','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (79,'DNS refers to','Data Number Sequence','Digital Network Service','Domain Name System','Disk Numbering System','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (80,'Java was originally invented by','Oracle','Microsoft','Novell','Sun','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (81,'The unit of speed used for super computer is','KELOPS','GELOPS','MELOPS','None of these','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (82,'Which gate is a single integrated circuit','Gate','Mother Board','Chip','CPU','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (83,'Web pages are written using','FTP','HTTP','HTML','URL','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (84,'_______  is need to build dynamic web documents','CGI','Java','HTML','All of the above','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (85,'Compilers and Interpreters are themselves','High level language','Codes','Mnemonics','Programs','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (86,'Find the odd one out','FTP','POP','SAP','TCP','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (87,'Select the smallest memory size','Terabyte','Gigabyte','Kilobyte','Megabyte','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (88,'Full form of TCP is','ransmission control program','Totalling control program','Transmission control protocol','Total control Protocol','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (89,'Pick the odd one out','Microsoft','IBM','Novell','Windows','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO computer VALUES (90,'Choose the odd one out','Digital computer','Super computer','Minicomputer','Micro computer','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (1,'Capital of Afghanistan','Abu Dhabi','Kabul','Mexico City','Zagreb','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (2,'Capital of Albania','Tirane','Melekeok','Abuja','Yerevan','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (3,'Capital of Algeria','Yaounde','Mbabane','Accra','Algiers','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (4,'Capital of Argentina','Buenos Aires','Amsterdam','Washington D.C.','Manama','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (5,'Capital of Australia','Canberra','Vilnius','Ankara','Male','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (6,'Capital of Austria','Malabo','Vientiane','Vienna','Antananarivo','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (7,'Capital of The Bahamas','Nassau','Victoria','Madrid','Ashgabat','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (8,'Capital of Bangladesh','Valletta','Lusaka','Astana','Dhaka','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (9,'Capital of Belarus','Athens','Minsk','Vaduz','London','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (10,'Capital of Belgium','Lome','Ulaanbaatar','Brussels','Baghdad','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (11,'Capital of Bhutan','Tokyo','Thimphu','Bandar Seri Begawan','Lima','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (12,'Capital of Bolivia','Tirane','Lilongwe','Bangkok','Sucre','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (13,'Capital of Brazil','Brasilia','Basseterre','Tegucigalpa','Kyiv','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (14,'Capital of Bulgaria','Sofia','Tashkent','Kuala Lumpur','Beirut','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (15,'Capital of Cambodia','Phnom Penh','Taipei','Kingston','Berlin','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (16,'Capital of Cameroon','Bern','Suva','Kigali','Yaounde','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (17,'Capital of Canada','Bishkek','Khartoum','Stockholm','Ottawa','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (18,'Capital of Central African Republic','Bangui','Kampala','Skopje','Bogota','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (19,'Capital of China','Beijing','Brazzaville','Bissau','Sarajevo','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (20,'Capital of Colombia','Bogota','Bishkek','Sao Tome','Bridgetown','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (21,'Capital of Costa Rica','San Jose','Belgrade','San Salvador','Buenos Aires','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (22,'Capital of Cuba','Basseterre','Havana','Canberra','Saint John''s','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (23,'Capital of Denmark','Rome','Khartoum','Chisinau','Copenhagen','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (24,'Capital of Dominican Republic','Reykjavik','Copenhagen','Santo Domingo','Kabul','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (25,'Capital of Egypt','Quito','Dar es Salaam','Bishkek','Cairo','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (26,'Capital of Estonia','Tallinn','Praia','Belgrade','Doha','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (27,'Capital of Finland','Helsinki','Basseterre','Porto-Novo','Freetown','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (28,'Capital of France','Gaborone','Paris','Port-of-Spain','Banjul','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (29,'Capital of Germany','Berlin','Bamako','Podgorica','Harare','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (30,'Capital of Greece','Lome','Athens','Helsinki','Paris','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (31,'Capital of Guinea','Conakry','Palikir','Jakarta','Lima','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (32,'Capital of Haiti','Kabul','La Paz','Oslo','Port-au-Prince','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (33,'Capital of Hungary','Kathmandu','Budapest','Kuwait City','Nouakchott','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (34,'Capital of Iceland','Reykjavik','Khartoum','Kuala Lumpur','No Official Capital','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (35,'Capital of India','Kigali','New Delhi','Mumbai','Kolkata','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (36,'Capital of Indonesia','Jakarta','Jakarta','Kingston','Niamey','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (37,'Capital of Iran','Tehran','Kingstown','New Delhi','Bern','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (38,'Capital of Iraq','Baghdad','Berlin','N''Djamena','Kinshasa','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (39,'Capital of Ireland','Dublin','Kuala Lumpur','Nassau','Minsk','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (40,'Capital of Italy','Melekeok','Kyiv','Muscat','Rome','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (41,'Capital of Japan','Libreville','Tokyo','Maseru','Moroni','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (42,'Capital of Kazakhstan','Manila','Monrovia','Astana','Lima','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (43,'Capital of Kenya','Monaco','Lisbon','Manama','Nairobi','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (44,'Capital of Korea, North','Lome','Male','Pyongyang','Minsk','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (45,'Capital of Korea, South','London','Malabo','Seoul','Mexico City','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (46,'Capital of Kuwait','Madrid','Kuwait City','Lusaka','Mbabane','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (47,'Capital of Lebanon','London','Manama','Malabo','Beirut','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (48,'Capital of Liberia','Ljubljana','Male','Managua','Monrovia','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (49,'Capital of Madagascar','Luanda','Antananarivo','Luanda','Melekeok','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (50,'Capital of Malaysia','Nome','Lomeq','Kuala Lumpur','Minsk','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (51,'Capital of Maldives','Ljubljana','Male','Mogadishu','Ljubljana','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (52,'Capital of Mali','Lisbon','Monaco','Bamako','Lisbon','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (53,'Capital of Mauritius','La Paz','Port Louis','Ra Ceazw','Moscow','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (54,'Capital of Mexico','Kyiv','Muscat','Mexico City','Kyiv','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (55,'Capital of Mongolia','Kingstown','New Delhi','Kingstown','Ulaanbaatar','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (56,'Capital of Morocco','Nicosia','Kigali','Rabat','Kigali','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (57,'Capital of Myanmar','Rangoon','Nouakchott','Kathmandu','No official Capital','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (58,'Capital of Nepal','Kathmandu','Juba','Ottawa','Oslo','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (59,'Capital of Netherlands','Jerusalem','Amsterdam','Jerusalem','Ouagadougou','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (60,'Capital of New Zealand','Palikir','Jakarta','Wellington','Jakarta','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (61,'Capital of Norway','Oslo','Havana','Phnom Penh','Havana','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (62,'Capital of Oman','Harare','Guatemala City','Muscat','Podgorica','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (63,'Capital of Pakistan','Hanoi','Islamabad','Port Louis','Melekeok','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (64,'Capital of Peru','Dushanbe','Lima','Port-Vila','Dushanbe','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (65,'Capital of Philippines','Manila','Dublin','Prague','Warsaw','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (66,'Capital of Poland','Prague','Warsaw','Doha','Praia','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (67,'Capital of Qatar','Doha','Dili','Pristina','Dhaka','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (68,'Capital of Saudi Arabia','Riyadh','Caracas','Saint Georges','Caracas','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (69,'Capital of Sierra Leone','Belgrade','San Salvador','Freetown','Buenos Aires','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (70,'Capital of Singapore','Beirut','Sanaa','Budapest','Singapore','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (71,'Capital of Somalia','Bangui','Brazzaville','Sarajevo','Mogadishu','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (72,'Capital of South Africa','Pretoria','Bratislava','Seoul','Bangkok','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (73,'Capital of Spain','Bamako','Madrid','Bogota','Skopje','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (74,'Capital of Sri Lanka','Colombo','Sofia','Baku','Bissau','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (75,'Capital of Switzerland','Bern','Tarawa Atoll','Belgrade','Asmara','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (76,'Capital of Syria','Beirut','Damascus','Tashkent','Ashgabat','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (77,'Capital of Taiwan','Tbilisi','Taipei','Beijing','Apia','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (78,'Capital of Tajikistan','Dushanbe','Antananarivo','Tegucigalpa','Basseterre','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (79,'Capital of Thailand','Andorra la Vella','Bangkok','Bangui','Thimphu','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (80,'Capital of Turkey','Ulaanbaatar','Baghdad','Ankara','Baghdad','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (81,'Capital of Tunisia','Tunis','Baku','Tripoli','Bamako','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (82,'Capital of Turkmenistan','Vaduz','Ashgabat','Athens','Asuncion','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (83,'Capital of Uganda','Astana','Kampala','Valletta','Asmara','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (84,'Capital of Ukraine','Kyiv','Asmara','Vatican City','Baku','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (85,'Capital of United Kingdom','Apia','London','Baghdad','Vienna','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (86,'Capital of United States of America','Washington D.C.','Vientiane','Vientiane','Antananarivo','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (87,'Capital of Uruguay','Asuncion','Montevideo','Ankara','Vilnius','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (88,'Capital of Vatican City','Amman','Wellington','Vatican City','Ashgabat','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (89,'Capital of Venezuela','Apia','Algiers','Windhoek','Caracas','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO capitals VALUES (90,'Capital of Yemen','Sanaa','Ankara','Yaounde','Accra','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (1,'Who wrote the famous book - ''We the people''','T.N.Kaul','J.R.D. Tata','Khushwant Singh','Nani Palkhivala','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (2,'Author of the book ''Nineteen Eighty Four''','Thomas Hardy','Emile Zola','George Orwell','Walter Scott','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (3,'Book NOT written by Munshi Premchand','Gaban','Godan','Guide','Manasorovar','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (4,'Author of the book ''Forbidden Verses''','Salman RushDie','Abu Nuwas','Ms. Taslima Nasrin','D.H. Lawrence','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (5,'Book written by Vikram Seth','My God Died Young','Islamic Bomb','Look Back in Anger','A Suitable Boy','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (6,'The book ''To Live or Not Live'' was written by','V.S. Naipaul','Alexandra Dumas','George Elliot','Nirad C. Chaudhuri','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (7,'First television programme was broadcasted in','1959','1965','1976','1957','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (8,'''A Voice for Freedom'' is a book written by','Corazon Aquino','Nayantara Sahgal','Aung San Suu Kyi','Benazir Bhutto','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (9,'Father of English Poetry','Milton','Wordsworth','Chaucer','Charles Dickens','C')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (10,'Book written by Graham Greene','O'' Jerusalem','The Power and Glory','Crisis in India','Of Human Bondage','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (11,'George Bernard Shaw, the great dramatist, was','a Welsh','an Irishman','a Soctsman','an Englishman','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (12,'''Anandmath'' was authored by','Sarojini Naidu','Sri Aurobindo','Rabindrnath Tagore','Bankim Chandra','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (13,'Aurobindo was the author of','Discovery of India','Hindu view of life','Yogashastra','Savitri','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (14,'''All India Radio'' was set up in','1936','1927','1947','1950','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (15,'''The Gathering Storm'' is written by','Winston Churchill','George Washington','Voltaire','Romain Rolland','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (16,'Author of the book ''My Experiments with Truth''','Mahatma Gandhi','Michael Anderson','Winston Churchill','Jarnes Morris','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (17,'The first history book was written by','Euclid','Herodotus','Aristotle','Julius Caesar','B')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (18,'''A Secular Agenda'' is  written by','Arun Shourie','Mani Shankar Aiyar','Prem Shankar Jha','Charles dickens','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (19,'Famous character ''Pickwick'' was created by','Steven Spielberg','Leo Tolstoy','Walt Disney','Charles dickens','D')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (20,'The creator of ''Sherlock Holmes'' was','Arthur Conan Doyle','Ian Fleming','Dr.Watson','Shakespeare','A')";
        sqLiteDatabase.execSQL(Insert_Data);
        Insert_Data = "INSERT INTO books VALUES (21,'Author of book ''We Indians''','Nirad C. Choudry','Subramaniya Swamy','Khushwant Singh','Muluk Raj Anand','C')";
        sqLiteDatabase.execSQL(Insert_Data);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        try {
            System.out.println("UPGRADE DB oldVersion=" + oldVersion + " - newVersion=" + newVersion);
            onCreate(sqLiteDatabase);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        System.out.println("DOWNGRADE DB oldVersion=" + oldVersion + " - newVersion=" + newVersion);
    }

    public String readQuestion(int i, String Table_name)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field note that Ans is just a local string not related to Answer or Option...
        SQLiteDatabase database = this.getReadableDatabase();
        String query = "SELECT " + Question + " FROM " + Table_name + " WHERE " + uid + " = " + i + "";
        Cursor c = database.rawQuery(query, null);//cursor to that query

        if (c.moveToFirst())
            Ans = c.getString(0);

        c.close();
        database.close();

        return Ans;
    }

    public String readOptionA(int i, String Table_name)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field note that Ans is just a local string not related to Answer or Option...
        SQLiteDatabase database = this.getReadableDatabase();
        String query = "SELECT " + OptionA + " FROM " + Table_name + " WHERE " + uid + " = " + i + "";
        Cursor c = database.rawQuery(query, null);//cursor to that query

        if (c.moveToFirst())
            Ans = c.getString(0);

        c.close();
        database.close();

        return Ans;
    }

    public String readOptionB(int i, String Table_name)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field note that Ans is just a local string not related to Answer or Option...
        SQLiteDatabase database = this.getReadableDatabase();
        String query = "SELECT " + OptionB + " FROM " + Table_name + " WHERE " + uid + " = " + i + "";
        Cursor c = database.rawQuery(query, null);//cursor to that query

        if (c.moveToFirst())
            Ans = c.getString(0);

        c.close();
        database.close();

        return Ans;
    }

    public String readOptionC(int i, String Table_name)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field note that Ans is just a local string not related to Answer or Option...
        SQLiteDatabase database = this.getReadableDatabase();
        String query = "SELECT " + OptionC + " FROM " + Table_name + " WHERE " + uid + " = " + i + "";
        Cursor c = database.rawQuery(query, null);//cursor to that query

        if (c.moveToFirst())
            Ans = c.getString(0);

        c.close();
        database.close();

        return Ans;
    }

    public String readOptionD(int i, String Table_name)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field note that Ans is just a local string not related to Answer or Option...
        String query = "SELECT " + OptionD + " FROM " + Table_name + " WHERE " + uid + " = " + i + "";
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor c = database.rawQuery(query, null);//cursor to that query

        if (c.moveToFirst())
            Ans = c.getString(0);

        c.close();
        database.close();

        return Ans;
    }

    public String readAnswer(int i, String Table_name)//Used to read the data from the Des.db file where id is given and we choose id randomly
    {
        String Ans = "";//string that contains the required field
        String query = "SELECT " + Answer + " FROM " + Table_name + " WHERE " + uid + " = " + i + "";
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.rawQuery(query, null);//cursor to that query

        if (cursor.moveToFirst())
            Ans = cursor.getString(0);

        cursor.close();
        database.close();

        return Ans;
    }

    public Integer getLength(String Table_name) {
        String countQuery = "SELECT  * FROM " + Table_name;
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor = database.rawQuery(countQuery, null);
        int length = cursor.getCount();
        cursor.close();
        database.close();

        return length;
    }
}