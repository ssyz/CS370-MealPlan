package emory.mealplan;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.lang.Math;
public class DatabaseInterfaceNoah extends MapsActivity{
    private DatabaseReference poiData=FirebaseDatabase.getInstance().getReference();
    private static final double R = 6372.8; // In kilometers
    private static double convFact=111111;//meters/degree lat
    private LatLngBounds poiBounds(double dist, Marker location) throws InvalidProtocolBufferException {

        LatLngBounds bounds=new LatLngBounds(swBound(dist,location),neBound(dist,location));

        return bounds;
    }
    private LatLng swBound(double dist, Marker loc) throws InvalidProtocolBufferException {
        double lat=loc.getPosition().latitude;
        double lon=loc.getPosition().longitude;
        LatLng sw=new LatLng((lat-(dist/convFact) ), (lon -Math.cos(lat)*(dist/convFact)));
        return sw;
    }
    private LatLng neBound(double dist, Marker loc) throws InvalidProtocolBufferException {
        double lat=loc.getPosition().latitude;
        double lon=loc.getPosition().longitude;
        LatLng ne=new LatLng((lat+(dist/convFact) ), (lon + Math.cos(lat)*(dist/convFact)));
        return ne;
    }

    private double haversine(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }
};

