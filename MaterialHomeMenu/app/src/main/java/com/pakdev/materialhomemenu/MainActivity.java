package com.pakdev.materialhomemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.pakdev.homemenu.BaseMenuActivity;
import com.pakdev.homemenu.HomeMenu;

import java.util.ArrayList;

public class MainActivity extends BaseMenuActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

       // setGridView(false, HomeMenu.DRAWABLE_SHAPE.ROUNDED);
        setShowMenuIcon(true);
       // setAnimation(HomeMenu.MENU_ANIMATION.RIGHT_TO_LEFT,300);
        super.onCreate(savedInstanceState);

    }

    @Override
    public ArrayList<HomeMenu> getHomeMenuList() {


        ArrayList<HomeMenu> arrData=new ArrayList<>();
        arrData.add(new HomeMenu().setMenuTitle("Home").setMenuDesc("Description").setMenuIcon(R.drawable.ic_home));
        arrData.add(new HomeMenu().setMenuTitle("About us").setMenuDesc("Description").setMenuIcon(R.drawable.ic_home));
        arrData.add(new HomeMenu().setMenuTitle("Sports").setMenuDesc("Description").setMenuIcon(R.drawable.ic_home));
        arrData.add(new HomeMenu().setMenuTitle("News").setMenuDesc("Description").setMenuIcon(R.drawable.ic_home));
        arrData.add(new HomeMenu().setMenuTitle("Help").setMenuDesc("Description").setMenuIcon(R.drawable.ic_home));
        arrData.add(new HomeMenu().setMenuTitle("Entertainments").setMenuDesc("Description").setMenuIcon(R.drawable.ic_home));

        return arrData;
    }

    @Override
    public void onMenuClick(HomeMenu model, int position) {

        Toast.makeText(this, "Click item is "+model.getMenuTitle() , Toast.LENGTH_SHORT).show();

    }
}
