package cr.ac.ucr.ecci.libraryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.echo.holographlibrary.Bar;
import com.echo.holographlibrary.BarGraph;
import com.echo.holographlibrary.PieGraph;
import com.echo.holographlibrary.PieSlice;

import java.util.ArrayList;

public class HoloGraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holo_graph);

        ArrayList<Bar> points = new ArrayList<Bar>();
        Bar d = new Bar();
        d.setColor(Color.parseColor("#0B6623"));
        d.setName("Test1");
        d.setValue(10);
        Bar d2 = new Bar();
        d2.setColor(Color.parseColor("#7C0A02"));
        d2.setName("Test2");
        d2.setValue(20);
        points.add(d);
        points.add(d2);

        BarGraph g = (BarGraph)findViewById(R.id.graph);
        g.setBars(points);

        PieGraph pg = (PieGraph)findViewById(R.id.graph1);
        PieSlice slice = new PieSlice();
        slice.setColor(Color.parseColor("#004F98"));
        slice.setValue(2);
        pg.addSlice(slice);
        slice = new PieSlice();
        slice.setColor(Color.parseColor("#0B6623"));
        slice.setValue(3);
        pg.addSlice(slice);
        slice = new PieSlice();
        slice.setColor(Color.parseColor("#7C0A02"));
        slice.setValue(8);
        pg.addSlice(slice);
    }
}