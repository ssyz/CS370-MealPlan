package emory.mealplan;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;

import com.google.android.gms.maps.GoogleMap;

import java.util.List;

public class PopulateMap extends Service {
    public PopulateMap() {

    }

    @Override
    public void onStart(Intent intent, int startId) {

        super.onStart(intent, startId);
        Bundle params=intent.getExtras();
        Object poiList=params.get("poiList");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service
        // .
        return null;
       // throw new UnsupportedOperationException("Not yet implemented");
    }
}
