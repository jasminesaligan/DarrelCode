print ("\nSummer Vacation is now happening, and you are given a chance to spend a day vacation at Witfaitum 'The summer sanctum' \n")
key = input("*press enter to continue \n")
name = input ("Please enter your name: ")
user = name.capitalize()
print ("\nWelcome to Witfaitum 'The summer sanctum',", user)
print ("Witfaitum is a new-found world where almost everything you want to experience exists here! \n")
key = input("*press enter to continue \n")
print ("*10:45 PM \n")
print ("Floors 4-9 are for the resident's floor") 
print ("Which among these floor units you want to stay? ")
print (" 4. Modern \n 5. Contemporary \n 6. Neo-classical \n 7. Bohemian \n 8. Industrial \n 9. Cyberpunk")

while True:
    floor_unit = input("Enter the floor number: ")
    if floor_unit == "4":
        print ("\nGreat choice! Welcome to Modern Style floor", floor_unit, "\n" "Now, go to your unit, make yourself comfortable and have a good rest! \n")
        break
    elif floor_unit == "5":
         print ("\nGreat choice! Welcome to Contemporary Style floor", floor_unit, "\n" "Now, go to your unit, make yourself comfortable and have a good rest! \n")
         break
    elif floor_unit == "6":
         print ("\nGreat choice! Welcome to Neo-classical Style floor", floor_unit, "\n" "Now, go to your unit, make yourself comfortable and have a good rest! \n")
         break
    elif floor_unit == "7":
         print ("\nGreat choice! Welcome to Bohemian Style floor", floor_unit, "\n" "Now, go to your unit, make yourself comfortable and have a good rest! \n")
         break
    elif floor_unit == "8":
         print ("\nGreat choice! Welcome to Industrial Style floor", floor_unit, "\n" "Now, go to your unit, make yourself comfortable and have a good rest! \n")
         break
    elif floor_unit == "9":
        print ("\nGreat choice! Welcome to Cyberpunk Style floor", floor_unit, "\n" "Now, go to your unit, make yourself comfortable and have a good rest! \n")
        break

floor_unit2 = floor_unit + "th floor"

Story = "y"

while Story == "y":

    # MORNING -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    # restaurant function definition
    def restaurant():
        print("Welcome to the restaurant")
        print("What would you like to eat for breakfast?\n")
        while True:
            print("Choose")
            resto = input("a. Italian Style   b. Filipino Style   c. American Style \n")
            if (resto == "a"):
                Italian_style()
                break
            elif (resto == "b"):
                Filipino_style()
                break
            elif (resto == "c"):
                American_style()
                break
                
    # Morning Italian_style function definition
    def Italian_style():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Itl = input ("a. Lobster Rissotto,   b. Frittata,   c. Ricotta Pancakes \n")
            if Itl == "a":
                print ("\nYou are now enjoying the famous Lobster Rissotto for breakfast made by the excellent Gordon Ramsay! \n")
                break
            elif Itl == "b":
                print ("\nYou are now enjoying the famous Frittata for breakfast made by the excellent Gordon Ramsay! \n")
                break
            elif Itl == "c":
                print ("\nYou are now enjoying the famous Ricotta Pancakes for breakfast made by the excellent Gordon Ramsay! \n")
                break
            else:
                print("\nThere are no other items in the menu")

    # Morning Filipino_Style function definition
    def Filipino_style():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Flp = input ("a. Bacon Fried Rice with Taho,   b. Filipino Scrambled eggs with Taho,   c. Ginisang Corned Beef with Taho \n")
            if Flp == "a":
                print ("\nYou are now enjoying the famous Bacon Fried Rice with Taho for breakfast made by the excellent Chef Boy Logro! \n")
                break
            elif Flp == "b":
                print ("\nYou are now enjoying the famous Filipino Scrambled eggs with Taho for breakfast made by the excellent Chef Boy Logro! \n")
                break
            elif Flp == "c":
                print ("\nYou are now enjoying the famous Ginisang Corned Beef with Taho for breakfast made by the excellent Chef Boy Logro! \n")
                break
            else:
                print("\nThere are no other items in the menu")

    # Morning American_style function definition
    def American_style():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Ame = input ("a. Eggs Benedict,   b. Belgian Waffles,   c. Bacon and Eggs \n")
            if Ame == "a":
                print ("\nYou are now enjoying the famous Eggs Benedict for breakfast made by the excellent Claudio Aprile! \n")
                break
            elif Ame == "b":
                print ("\nYou are now enjoying the famous Belgian Waffles for breakfast made by the excellent Claudio Aprile! \n")
                break
            elif Ame == "c":
                print ("\nYou are now enjoying the famous Bacon and Eggs for breakfast made by the excellent Claudio Aprile! \n")
                break
            else:
                print("\nThere are no other items in the menu")
                
    #end of Morning restaurant function

    # Morning Garden function definition
    def garden():
        print("Is there anything you wanna do in the garden?")
        while True:
            print("Choose")
            ab = input("a. Water the plants in the garden,   b. Stay in your seat and enjoy the cool breeze \n")
            if ab == "a":
                print("*You are now watering the sunflowers, marigold, peashooter, and every plants you see \n")
                break
            elif ab == "b":
                print("\nYou stayed in the garden for some time\n")
                break
    # end of Morning garden function definition

    # Morning gym function definition
    def gym():
        print("What workout will you do first?")
        while True:
            print("Choose")
            ab = input("a. Cardiovascular Endurance workout,   b. Muscular Endurance workout \n")
            if ab == "a":
                print("*You decided to have a Cardiovascular Endurance workout before doing the Muscular Endurance workout. \n")
                break
            elif ab == "b":
                print("*You decided to have a Muscular Endurance workout before doing the Cardiovascular Endurance workout. \n")
                break
    # end of Morning gym function definition
    # -------------------------------------------------------------------------------------------------------

    key = input("*press enter to continue \n")

    for i in range(6, 7):
        for j in range(1, 60):
            for k in range(1, 60):
                print(i, ":", j, ":", k)

    print ("──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────")
    print ("Good morning", user, "! It's now 7:00 A.M Which among these floors do you want to spend your morning in? \n")
    print (" 10. Restaurant \n 16. Garden \n 3. GYM \n")

    while True:
        floors1 = input ("Enter the floor number: ")
        if floors1 == "10":
            print ("\nWelcome to the 10th floor!")
            print ("You enter the restaurant")
            print ("The restaurant style suits your liking, it has a suitable colour scheme with a piece of beautiful jazz music and good quality service! \n")
            restaurant()
            print ("After breakfast, choose among these floors you also want to spend your morning \n")
            print (" 16. Garden \n 3. GYM \n")
            break
        elif floors1 == "16":
            print ("\nWelcome to the 16th floor!")
            print ("You are now in a garden enjoying the beautiful view from the outside with your coffee \nand the fresh air flowing makes you calm and at peace.\n")
            garden()
            print ("After spending some time in the garden, you want to have your breakfast now\n")
            print (" 10. Restaurant \n")
            break
        elif floors1 == "3":
            print ("\nWelcome to the 3rd floor!")
            print ("Welcome to the GYM\n")
            gym()
            print ("After spending some time in the gym, you wanted to have your breakfast\n")
            print (" 10. Restaurant \n")
            break
        else:
            print("You are in the wrong floor")

    while True:
        floors2 = input ("Enter the floor number: ")
        if floors2 == "10":
            print ("\nWelcome to the 10th floor!")
            print ("You enter the restaurant")
            print ("The restaurant style suits your liking, it has a suitable colour scheme with a piece of beautiful jazz music and good quality service! \n")
            restaurant()
            break
        elif floors2 == "16":
            print ("\nWelcome to the 16th floor!")
            print ("You are now in a garden enjoying the beautiful view from the outside with your coffee \nand the fresh air flowing makes you calm and at peace. \n")
            garden()
            break
        elif floors2 == "3":
            print ("\nWelcome to the 3rd floor!")
            print ("You are now inside the GYM.\n")
            gym()
            break
        else:
            print("You are in the wrong floor \n")
        

    print("*10: 00 AM\n")
    print("*After doing your morning activities")
    print("You decided to go back to your unit to put your feet up and freshen up. \n")



    # afternoon ------------------------------------------------------------------------------------------------------
    # Afternoon restaurant function definition
    def restaurant2():
        print("\nWelcome to the restaurant")
        print("What would you like to eat for your lunch?\n")
        while True:
            print("Choose")
            resto = input("a. French Style   b. Indian Style   c. Japanese Style \n")
            if (resto == "a"):
                French_style2()
                break
            elif (resto == "b"):
                Indian_style2()
                break
            elif (resto == "c"):
                Japanese_style2()
                break

    # Afternoon French_style function definition
    def French_style2():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Frn2 = input ("a. Steak Tartare,   b. Moules Frites,   c. Bouillabaisse \n")
            if Frn2 == "a":
                print ("\nYou are now enjoying the Steak Tartare for lunch made with raw ground beef, onions, capers, mushrooms, pepper, and Worcestershire sauce! \n")
                break
            elif Frn2 == "b":
                print ("\nYou are now enjoying Moules Frites, it is a steamed mussels and fried potatoes go together as naturally as fish and chips! \n")
                break
            elif Frn2 == "c":
                print ("\nYou are now enjoying the famous Bouillabaisse. This traditional French fish soup is infused with saffron, orange, thyme and chilli.! \n")
                break
            else:
                print("\nThere are no other items in the menu")

    # Afternoon Indian_Style function definition
    def Indian_style2():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Ind2 = input ("a. Chicken Makhani (Butter Chicken Curry),   b. Kalan Milagu Varuval (Mushroom pepper Fry),   c. Gujarati Kadhi \n")
            if Ind2 == "a":
                print ("\nYou are now enjoying the famous Chicken Makhani made from tomatoes, fresh cream, cashew nuts, onions and lots of Indian spices.! \n")
                break
            elif Ind2 == "b":
                print ("\nYou are now enjoying the famous Kalan Milagu Varuval (Mushroom pepper Fry). The heat from the pepper and the texture of mushrooms makes this dish very hearty! \n")
                break
            elif Ind2 == "c":
                print ("\nYou are now enjoying the famous Gujarati Kadhi. It is a very popular Gujarati dish made from buttermilk or dahi and gram flour. ! \n")
                break
            else:
                print("\nThere are no other items in the menu")

    # Afternoon Japanese_style function definition
    def Japanese_style2():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Jpn2 = input ("a. Gyukatsu (Beef cutlet),   b. Katsudon,   c. Traditional Sushi \n")
            if Jpn2 == "a":
                print ("\nYou are now enjoying Gyukatsu for lunch! A dish of deep-fried breaded beef, usually served with cabbage, barley rice, miso soup, and potato salad, and pickles. \n")
                break
            elif Jpn2 == "b":
                print ("\nYou are now enjoying Katsudon for lunch! A pork chop breaded with panko and fried over rice with onion and egg.  \n")
                break
            elif Jpn2 == "c":
                print ("\nYou are now enjoying the famous Authentic Sushi for lunch! Contains three to four ingredients that are packed with minerals and vitamins. \n")
                break
            else:
                print("\nThere are no other items in the menu")

    #end of Afternoon restaurant function

    # Afternoon Amusement Arcade function definition
    def Arcade():
        code = 1
        game = "y"

        while game == "y":
            guess = int (input("Guess the number from 1-10: \n"))

            if guess == code:
                print ("You've got it right \n")
                break
            else:
                print ("Wrong \n")
                game = input ("Do you want to play again? Press y if Yes. Press n if No \n")
    # End of Afternoon Amusement Arcade function definition

    #END OF FUNCTION DEFINITION-----------------------------------------------------------------------------------------------------------------------

    key = input("*press enter to continue \n")

    for i in range(10, 12):
        for j in range(1, 60):
            for k in range(1, 60):
                print(i, ":", j, ":", k)

    print ("──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────")

    print("*12:00 PM \n")
    print("It's now lunchtime! You are hungry, the restaurant is on the 10th floor")
    print("You walked inside the elevator and enter the floor number of the restaurant \n")
    print(" 10. Restaurant \n")

    while True: 
        floors3 = input ("Enter floor number: ")
        if floors3 == "10":
            restaurant2()
            print ("You are now deciding which floor you want to first spend your afternoon on after eating your lunch ")
            print ("Choose")
            print (" 12. Amusement Park \n 13. Amusement Arcade \n 14. Swimming Park \n 15. Shopping Mall" )
            break
        else:
            print ("You are in the wrong floor\n")


    while True: 
        floors4 = input ("Enter floor number: ")
        if floors4 == "12":
            print("\nWelcome to the 12th floor!")
            print("You are now inside the Amusement Park\n")
            print("The Amusement Park with numerous entertainment-related attractions, including rides games and other activities. A theme park is a particular kind of amusement park that centres its buildings and \nattractions on the main subject and frequently has many areas with various themes")
            print("You decided to ride a roller coaster, carousel and played the bumper car\n")
            print("You are enjoying everything in the amusement park but you decided to take a break and spend some time on another floor.")
            print(" 13. Amusement Arcade \n 14. Swimming Park \n 15. Shopping Mall" )
            break
        elif floors4 == "13":
            print("\nWelcome to the 13th floor!")
            print("You are now inside the Amusement Arcade and you wanted to play a game\n")
            Arcade()
            print("\nAfter spending some time in the Amusement Arcade")
            print ("You decided to take a break and spend some time on another floor\n")
            print("Choose among these floors you want to spend your time")
            print(" 12. Amusement Park \n 14. Swimming Park \n 15. Shopping Mall" )
            break
        elif floors4 == "14":
            print("\nWelcome to the 14th floor!")
            print("You decided to sun bathe for awhile and did some fun activities like impressing others with your skills at surfing and enjoying the biggest water slide.\n")
            print("After spending some time in Water park Park")
            print ("You decided to take a break and spend some time on another floor")
            print("Which among these floor you want to spend your time")
            print(" 12. Amusement Park \n 13. Amusement Arcade \n 15. Shopping Mall")
            break
        elif floors4 == "15":
            print("\nWelcome to the 15th floor!")
            print("You decided to buy some clothes at Louis Vuitton. Get some cool shoes at Gucci and some bags at Prada.\nYou heard about the latest release of an iPhone model, so you decided to buy the iPhone 14 and other latest apple products\n")
            print("After spending some time in the Shopping Mall, you decided to take a break and spend some time on another floor")
            print("Choose among these floors you want to spend your time")
            print(" 12. Amusement Park \n 13. Amusement Arcade \n 14. Swimming Park")
            break
        else:
            print("You are in the wrong floor.\n")
        
    while True: 
        floors5 = input ("Enter floor number: ")
        if floors5 == "12":
            print("\nWelcome to the 12th floor!")
            print("You are now inside the Amusement Park\n")
            print("The Amusement Park with numerous entertainment-related attractions, including rides games and other activities. A theme park is a particular kind of amusement park that centres its buildings and \nattractions on the main subject and frequently has many areas with various themes")
            print("You decided to ride a roller coaster, carousel and played the bumper car\n")
            print("\nYou are enjoying everything in the amusement park but you decided to take a break")
            break
        elif floors5 == "13":
            print("\nWelcome to the 13th floor!")
            print("You are now inside the Amusement Arcade and you wanted to play a game\n")
            Arcade()
            print("After playing the game, you decided to take a break")
            break
        elif floors5 == "14":
            print("\nWelcome to the 14th floor!")
            print("You decided to sun bathe for awhile and did some fun activities like impressing others with your skills at surfing and enjoying the biggest water slide.\n")
            break
        elif floors5 == "15":
            print("\nWelcome to the 15th floor!")
            print("You decided to buy some clothes at Louis Vuitton. Get some cool shoes at Gucci and some bags at Prada.\nYou heard about the latest release of an iPhone model, so you decided to buy the iPhone 14 and other latest apple products")
            break
        else:
            print("You are in the wrong floor.\n")
            
    key = input("\n*press enter to continue \n")
        
    print("*After spending your time doing all the activities in your afternoon routine")
    print("You decided to spend the rest of your time in some place\n")
    print("*5:00 PM\n")

    #Evening -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Evening restaurant function definition
    def restaurant3():
        print("\nWelcome to the restaurant")
        print("What would you like to eat for your dinner?\n")
        while True:
            print("Choose")
            resto = input("a. Korean Style   b. Turkish Style   c. Mexican Style \n")
            if (resto == "a"):
                Korean_style3()
                break
            elif (resto == "b"):
                Turkish_style3()
                break
            elif (resto == "c"):
                Mexican_style3()
                break

    # Evening Korean_style function definition
    def Korean_style3():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Sokor3 = input ("a. Jjajangmyeon (짜장면),   b. Bibimbap (비빔밥),   c. Chuncheon dakgalbi (춘천 닭갈비) \n")
            if Sokor3 == "a":
                print ("\nYou are now enjoying the famous Korean cuisine, Jjajangmyeon for dinner! A noodle dish in a black bean sauce that has sweet taste that savours in your mouth!  \n")
                break
            elif Sokor3 == "b":
                print ("\nYou are now enjoying Bibibmbap for dinner! Mixes together a simple salad of rice, mixed vegetables, rice, beef, and egg, with sesame oil and a dollop of chili paste for seasoning.\n")
                break
            elif Sokor3 == "c":
                print ("\nYou are now enjoying Chuncheon dakgalbi for dinner! A chunks of chicken that are marinated in a sauce of chili paste and other spices, and stir-fried in a large pan with tteok, cabbage, carrots, and slices of sweet potato. \n")
                break
            else:
                print("\nThere are no other items in the menu")

    # Evening Turkish_Style function definition
    def Turkish_style3():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Trk3 = input ("a. Saksuka,   b. Yaprak Dolma,   c. Pide \n")
            if Trk3 == "a":
                print ("\nYou are now enjoying the famous Saksuka. One of the tastiest eggplant offerings is sasuka. \nHere silky purple skinned cubes of green flesh are cooked with zucchinis, garlic, tomatoes and chilli! \n")
                break
            elif Trk3 == "b":
                print ("\nYou are now enjoying the famous Yaprak Dolma. \nThe rice is cooked with tomatoes, a bunch of parsley, onion, garlic, tomato paste, olive oil, black pepper, salt and water.! \n")
                break
            elif Trk3 == "c":
                print ("\nYou are now enjoying the famous Pide. The most popular is sucuklu yumurta, spicy Turkish sausage and egg mixed with kasar \n(yellow sheep cheese) but ispanakli kasar, spinach with cheese, is equally good.   ! \n")
                break
            else:
                print("\nThere are no other items in the menu")

    # Evening Mexican_style function definition
    def Mexican_style3():
        while True:
            print ("\nThis is the menu")
            print ("Choose")
            Mxc3 = input ("a. Discada (Plow disc BBQ),   b. Pozole de Pollo o Guajolote (Chicken or Wild Turkey Stew),   c. Quesadilla \n")
            if Mxc3 == "a":
                print ("\nYou are now enjoying Discada for Dinner! It's full of meat: sausage, chorizo, ground meat, ham, bacon, lard, jalapeño pepper, onion.\n")
                break
            elif Mxc3 == "b":
                print ("\nYou are now enjoying Pozole de Pollo o Guajolote for Dinner!\n")
                break
            elif Mxc3 == "c":
                print ("\nYou are now enjoying the famous Quesadilla! A corn or flour tortilla folded in half, stuffed with cheese or other ingredients, deep fried or grilled and eaten hot.\n")
                break
            else:
                print("\nThere are no other items in the menu")

    #end of Evening restaurant function ------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    key = input("*press enter to continue \n")

    for i in range(5, 7):
        for j in range(1, 60):
            for k in range(1, 60):
                print(i, ":", j, ":", k)
        
    print ("──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────")      
    print ("7:00 P.M. It's now dinnertime! You are hungry, so you walked inside the elevator and enter the 10th floor number of the restaurant")
    print (" 10. Restaurant \n")
    while True:
        floor6 = input ("Enter the floor number of the Restaurant: ")
        if floor6 == "10":
            restaurant3()
            break
        else:
            print ("Wrong floor\n")

    print ("\nAfter dinnertime, choose which floor how you want to spend your evening.")
    print ("11. Bar and Casino or Just stay in your unit,", floor_unit2)
    while True:
        floor7 = input ("Enter floor number: ")
        if floor7 == "11":
            print("\nBar and casino, you get to gamble, see best shows and acts, interact with other people, party, and watch a game")
            print("After spending some time in the Bar and Casino, you decided to go home to freshen up yourself\n")
            break
        elif floor7 == "4":
            print ("\nYou decided to just chill and do a marathon movie on a cozy bed with your favourite snacks.\n")
            break
        elif floor7 == "5":
            print ("\nYou decided to just chill and do a marathon movie on a cozy bed with your favourite snacks.\n")
            break
        elif floor7 == "6":
            print ("\nYou decided to just chill and do a marathon movie on a cozy bed with your favourite snacks.\n")
            break
        elif floor7 == "7":
            print ("\nYou decided to just chill and do a marathon movie on a cozy bed with your favourite snacks.\n")
            break
        elif floor7 == "8":
            print ("\nYou decided to just chill and do a marathon movie on a cozy bed with your favourite snacks.\n")
            break
        elif floor7 == "9":
            print ("\nYou decided to just chill and do a marathon movie on a cozy bed with your favourite snacks.\n")
            break

    key = input("*press enter to continue")

    print("\nYou are relaxing all night and sleep\n")

    Story = input("Do you want to spend another day in WitFaitum? press y is Yes and press any key to stop\n")
    
print("End of Story")
