package is.gravendef.enter;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class daoemployee
{
    private DatabaseReference databaseReference;
    private FirebaseDatabase db;
    public daoemployee()
    {
        db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(employee.class.getSimpleName());

    }
    public Task<Void> add(employee emp)
    {
        //if(emp==null)//exception
        return databaseReference.push().setValue(emp);
    }

}
