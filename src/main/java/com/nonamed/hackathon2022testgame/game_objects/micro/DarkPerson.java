package com.nonamed.hackathon2022testgame.game_objects.micro;

import com.nonamed.hackathon2022testgame.Config;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import static com.nonamed.hackathon2022testgame.Config.NAME_LIST;
import static com.nonamed.hackathon2022testgame.Config.RANDOM;
import static com.nonamed.hackathon2022testgame.GameWorldHandler.HERO;

public class DarkPerson extends AbstractPerson {

    public static final int DEFAULT_HEALTH_FOR_DARK_SIDE = 1000;
    public static final int DEFAULT_DAMAGE_FOR_DARK_SIDE = 3;

    public DarkPerson(int posX, int posY) {
        name = NAME_LIST.get(RANDOM.nextInt(NAME_LIST.size()));
        this.health = DEFAULT_HEALTH_FOR_DARK_SIDE;
        this.damage = DEFAULT_DAMAGE_FOR_DARK_SIDE;
        this.posX = posX;
        this.posY = posY;
        speed = 2;

        setUpPersonPicturesGroup();
//        initTimerToMovePerson();
    }

    @Override
    protected void setUpPersonPicturesGroup() {
        initImageView("darkSidePerson.png");
        initNameText();
        initHealthLine(DEFAULT_HEALTH_FOR_DARK_SIDE, Color.RED);
    }

    public void move() {
        moveToTarget(HERO.getPosX(), HERO.getPosY());
        if (group.getBoundsInParent().intersects(HERO.getGroup().getBoundsInParent())) {
            health -= HERO.getDamage();
            HERO.setHealth(HERO.getHealth() - damage);
            //System.out.println(health);
            if (health < 0) {
                timer.stop();
            }

        }
    }

    protected void upDatePerson() {
        speed = Config.RANDOM.nextInt(Config.DARK_PERSON_SPEED) - 2;
        upDateAllPersonImages(DEFAULT_HEALTH_FOR_DARK_SIDE);
    }

    public void moveToTarget(int targetPosX, int targetPosY) {
        if (posX < targetPosX) {
            setPosX(getPosX() - speed);
            imageView.setImage(new Image("darkSidePersonRight.png"));
        } else {
            setPosX(getPosX() + speed);
            imageView.setImage(new Image("darkSidePersonLeft.png"));
        }
        upDatePerson();
        if (posY < targetPosY) {
            setPosY(getPosY() - speed);
            group.setLayoutY(getPosY());
        } else {
            setPosY(getPosY() + speed);
        }
        upDatePerson();
    }

}