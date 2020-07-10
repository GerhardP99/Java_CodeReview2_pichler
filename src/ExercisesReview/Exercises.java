package ExercisesReview;

import java.util.concurrent.TimeUnit;

public class Exercises {
    String ExerciseName;
    int ExerciseDuration;
    String Description;
    boolean OnFloor;

    public Exercises(String ExerciseName, int ExerciseDuration, String Description, boolean OnFloor){
            this.ExerciseName = ExerciseName;
            this.Description = Description;
            this.ExerciseDuration = ExerciseDuration;
            this.OnFloor = OnFloor;
    }

    void PrintExercises(){
        System.out.printf("\n%s %20s DURATION: %d seconds.\n",this.ExerciseName,"",this.ExerciseDuration);
        System.out.println("----------------------------------------------------------------");
        System.out.println(this.Description);
    }

    public static void main(String[] args) throws InterruptedException {
/*
      !!! Exercises with the exercise Duration between the exercises and without the Arrays, to test it just uncomment it. !!!

        Exercises exercise1 = new Exercises("Push-Ups              ",30,"DESCRIPTION:\nPlace your hands on the floor. Raise up onto your toes so that all\nof your body weight is on your hands and your feet. Bend your elbows\nand lower your chest down toward the floor. Then, push off the floor\nand extend them so that you return to starting position.",true);
        Exercises exercise2 = new Exercises("Planks                ",90,"DESCRIPTION:\nStart on the floor on your hands and knees. Lower your forearms\nto the floor with elbows positioned under your shoulders and your\nhands shoulder-width apart. Maintain a straight line from heels\nthrough the top of your head, looking down at the floor. Now,\ntighten your abs and hold.",true);
        Exercises exercise3 = new Exercises("Squats                ",45,"DESCRIPTION:\nStand with feet a little wider than shoulder-width apart, hips\nstacked over knees, and knees over ankles. Extend arms out straight\nso they are parallel with the ground, palms facing down.  Goto a squat\nand exhale, then explode back up to standing, driving through heels.",false);
        Exercises exercise4 = new Exercises("Backward Kick         ",60,"DESCRIPTION:\nGet in an all-fours position with your knees and hands on the floor.\nYour back is straight. Lift your leg up, and straighten it. Form a\n90 degree angle in the ankle. Raise your leg with your heel pushing\nup and constantly forming a 90 degree angle in between the legs.\nReturn to the starting position and repeat.",true);
        Exercises exercise5 = new Exercises("Leg Curl              ",90,"DESCRIPTION:\nStand up on, shift your weight to  one feet and pull another heel\ntoward your buttocks. Stay for 15 seconds, then repeat with your other leg.",false);
        Exercises exercise6 = new Exercises("Sidewards Back Stretch",60,"DESCRIPTION:\nGo into standing position, put your hands on your hips and then\nstretch with one hand over your head to the opposite side.\nRepeat with other hand.",false);

        exercise1.PrintExercises();
        TimeUnit.SECONDS.sleep(exercise1.ExerciseDuration); // duration of the workout
        exercise2.PrintExercises();
        TimeUnit.SECONDS.sleep(exercise2.ExerciseDuration); // duration of the workout
        exercise3.PrintExercises();
        TimeUnit.SECONDS.sleep(exercise3.ExerciseDuration); // duration of the workout
        exercise4.PrintExercises();
        TimeUnit.SECONDS.sleep(exercise4.ExerciseDuration); // duration of the workout
        exercise5.PrintExercises();
        TimeUnit.SECONDS.sleep(exercise5.ExerciseDuration); // duration of the workout
        exercise6.PrintExercises();
        TimeUnit.SECONDS.sleep(exercise6.ExerciseDuration); // duration of the workout*/



// With Arrays and if its only on floor and over 60 seconds

        Exercises ex[] = new Exercises[6];

        ex[0] = new Exercises("Push-Ups              ",30,"DESCRIPTION:\nPlace your hands on the floor. Raise up onto your toes so that all\nof your body weight is on your hands and your feet. Bend your elbows\nand lower your chest down toward the floor. Then, push off the floor\nand extend them so that you return to starting position.",true);
        ex[1] = new Exercises("Planks                ",90,"DESCRIPTION:\nStart on the floor on your hands and knees. Lower your forearms\nto the floor with elbows positioned under your shoulders and your\nhands shoulder-width apart. Maintain a straight line from heels\nthrough the top of your head, looking down at the floor. Now,\ntighten your abs and hold.",true);
        ex[2] = new Exercises("Squats                ",45,"DESCRIPTION:\nStand with feet a little wider than shoulder-width apart, hips\nstacked over knees, and knees over ankles. Extend arms out straight\nso they are parallel with the ground, palms facing down.  Goto a squat\nand exhale, then explode back up to standing, driving through heels.",false);
        ex[3] = new Exercises("Backward Kick         ",60,"DESCRIPTION:\nGet in an all-fours position with your knees and hands on the floor.\nYour back is straight. Lift your leg up, and straighten it. Form a\n90 degree angle in the ankle. Raise your leg with your heel pushing\nup and constantly forming a 90 degree angle in between the legs.\nReturn to the starting position and repeat.",true);
        ex[4] = new Exercises("Leg Curl              ",90,"DESCRIPTION:\nStand up on, shift your weight to  one feet and pull another heel\ntoward your buttocks. Stay for 15 seconds, then repeat with your other leg.",false);
        ex[5] = new Exercises("Sidewards Back Stretch",60,"DESCRIPTION:\nGo into standing position, put your hands on your hips and then\nstretch with one hand over your head to the opposite side.\nRepeat with other hand.",false);

        for(int i = 0; i<ex.length; i++){
            ex[i].PrintExercises();
        }
        TimeUnit.SECONDS.sleep(5);
        System.out.println("\n\nNow only the ones that are on the Floor and take over one minute");
        for(int i = 0; i<ex.length; i++){
            if(ex[i].OnFloor = true && ex[i].ExerciseDuration >60 || ex[i].OnFloor){ // is it on the floor and over 60 seconds?
                ex[i].PrintExercises();
            }
        }
    }
}
