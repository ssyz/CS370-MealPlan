package emory.mealplan;
import android.util.Log;

import java.util.List;
import com.google.android.gms.maps.GoogleMap;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class PinDropNoah extends MapsActivity{
    List poiList;

    public PinDropNoah(GoogleMap current, List poiList) {
        PinDropNoah(current, poiList);
    }


    void PinDropNoah(GoogleMap currentMap, List poi){
        this.poiList=poi;
        //double[][] latlng=new double[poiList.size()][2];

        for(int i=2; i<poiList.size()-1;i=i+2){
            Object row=poiList.get(i);
   //       Log.d("RowstringA",row.toString());
            LatLng newMarker = new LatLng(Double.parseDouble(poiList.get(i+1).toString()),Double.parseDouble(poiList.get(i).toString()));

            currentMap.addMarker(new MarkerOptions().position(newMarker).alpha(0.1f));
        }


    }

}

