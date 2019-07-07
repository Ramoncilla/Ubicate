package com.ejemplo.toolbar.Adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.ejemplo.toolbar.Fragments.FavoritosFragment;
import com.ejemplo.toolbar.Fragments.HistorialFragment;
import com.ejemplo.toolbar.Fragments.MapaFragment;

public class PageAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;


    public PageAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs= numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return  new MapaFragment();
            case 1:
                return  new FavoritosFragment();
            case 2:
                return  new HistorialFragment();
            default:
                return  null;
        }
    }

    @Override
    public int getCount(){
        return numberOfTabs;
    }


}
