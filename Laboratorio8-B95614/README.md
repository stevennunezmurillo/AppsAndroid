# Laboratorio 8 - Librerias #

1. Preparar ambiente <br/>
1.1 Incluir dependencias <br/>
    implementation 'com.airbnb.android:lottie:5.2.0' <br/>
    implementation 'org.quanqi:android-holo-graph:0.1.0' <br/>


2. Crear SplashActivity <br/>
2.1 Crear un Activity llamado SplashActivity <br/>
2.2 Actualizar el archivo activity_splash.xml <br/>
<pre>
<code>
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".SplashActivity">
    <TextView
        android:id="@+id/txtName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="20dp"
        android:text="Universidad de Costa Rica"
        android:textColor="@color/purple_200"
        android:textSize="25dp"
        android:textStyle="bold"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent" />
    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lottieAnimation"
        android:layout_width="400dp"
        android:layout_height="400dp"
        android:elevation="5dp"
        app:layout_constraintBottom_toTopOf="@+id/txtName"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:lottie_autoPlay="true"
        app:lottie_rawRes="@raw/university"/>
</androidx.constraintlayout.widget.ConstraintLayout>
</code>
</pre>


2.3 Actualizar el SplashActivity
<pre>
<code>
public class SplashActivity extends AppCompatActivity {
    TextView appName;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        appName = findViewById(R.id.txtName);
        lottieAnimationView = findViewById(R.id.lottieAnimation);
        appName.animate().translationY(-400).setDuration(2700).setStartDelay(0);
        lottieAnimationView.animate().translationX(2000).setDuration(2000).setStartDelay(2900);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }, 5000);
    }
}
</code>
</pre>

2.4 Modificamos el AndroidManifest.xml para que nuestro Activity principal sea el SplashActivity <br/>


3. Crear LottieActivity <br/>
3.1 Crear un Activity llamado LottieActivity <br/>
3.2 Actualizar el archivo activity_lottie.xml <br/>
<pre>
<code>
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/white"
    tools:context=".LottieActivity">
    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lav_actionBar"
        android:layout_width="match_parent"
        android:layout_height="75dp"
        android:layout_marginStart="0dp"
        android:layout_marginTop="0dp"
        android:layout_marginEnd="0dp"
        android:scaleType="centerCrop"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:lottie_autoPlay="true"
        app:lottie_fileName="gradient_bg.json"
        app:lottie_loop="true" />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:text="@string/app_holo_graph"
        android:textColor="@android:color/white"
        android:textSize="30sp"
        app:layout_constraintBottom_toBottomOf="@+id/lav_actionBar"
        app:layout_constraintEnd_toEndOf="@+id/lav_actionBar"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="@+id/lav_actionBar" />
    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lav_thumbUp"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_marginStart="80dp"
        android:layout_marginTop="8dp"
        android:layout_marginBottom="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:lottie_autoPlay="false"
        app:lottie_fileName="thumb_up.json"
        app:lottie_loop="false"
        app:lottie_speed="1.25" />
    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lav_thumbDown"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="80dp"
        android:layout_marginBottom="8dp"
        android:rotation="180"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:lottie_autoPlay="false"
        app:lottie_fileName="thumb_up.json"
        app:lottie_loop="false"
        app:lottie_speed="1.25" />
    <com.airbnb.lottie.LottieAnimationView
        android:id="@+id/lav_toggle"
        android:layout_width="wrap_content"
        android:layout_height="100dp"
        android:layout_marginStart="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/lav_thumbUp"
        app:layout_constraintVertical_bias="0.4"
        app:lottie_autoPlay="false"
        app:lottie_fileName="toggle_switch.json"
        app:lottie_loop="false"
        app:lottie_speed="1.75" />
</androidx.constraintlayout.widget.ConstraintLayout>
</code>
</pre>

3.3 Actualizar el LottieActivity
<pre>
<code>
public class LottieActivity extends AppCompatActivity {
    LottieAnimationView thumb_up;
    LottieAnimationView thumb_down;
    LottieAnimationView toggle;
    int flag = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        thumb_up = findViewById(R.id.lav_thumbUp);
        thumb_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thumb_down.setProgress(0);
                thumb_down.pauseAnimation();
                thumb_up.playAnimation();
            }
        });
        thumb_down = findViewById(R.id.lav_thumbDown);
        thumb_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thumb_up.setProgress(0);
                thumb_up.pauseAnimation();
                thumb_down.playAnimation();
            }
        });
        toggle = findViewById(R.id.lav_toggle);
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeState();
            }
        });
    }
    private void changeState() {
        if (flag == 0) {
            toggle.setMinAndMaxProgress(0f, 0.43f); 
            toggle.playAnimation();
            flag = 1;
        } else {
            toggle.setMinAndMaxProgress(0.5f, 1f);
            toggle.playAnimation();
            flag = 0;
        }
    }
}
</code>
</pre>
3.4 Modificamos el MainActivity <br/>
<pre>
<code>
    //Invoca el activity de Lottie
    public void activityLottie(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LottieActivity.class);
        startActivity(intent);
    }
</code>
</pre>
3.5 Modificamos el activity_main.xml <br/>
<pre>
<code>
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <Button
            android:id="@+id/btnLottie"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginEnd="40dp"
            android:layout_marginStart="40dp"
            android:layout_marginTop="16dp"
            android:text="@string/btnLottie"
            android:onClick="activityLottie"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            tools:layout_constraintLeft_creator="1"
            tools:layout_constraintRight_creator="1"/>
    </androidx.constraintlayout.widget.ConstraintLayout>
</ScrollView>
</code>
</pre>

4. Crear HoloGraphActivity <br/>
4.1 Crear un Activity llamado HoloGraphActivity <br/>
4.2 Actualizar el archivo activity_holo_graph.xml <br/>
<pre>
<code>
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".ShimmerActivity">
    <com.echo.holographlibrary.BarGraph
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:id="@+id/graph"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    <com.echo.holographlibrary.PieGraph
        android:layout_width="match_parent"
        android:layout_height="200dp"
        android:id="@+id/graph1"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>
</androidx.constraintlayout.widget.ConstraintLayout>
</code>
</pre>

4.3 Actualizar el HoloGraphActivity
<pre>
<code>
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
</code>
</pre>
4.4 Modificamos el MainActivity <br/>
<pre>
<code>
    public void activityHoloGraph(View view)
    {
        Intent intent = new Intent(getApplicationContext(), HoloGraphActivity.class);
        startActivity(intent);
    }
</code>
</pre>
4.5 Modificamos el activity_main.xml <br/>
<pre>
<code>
        <Button
            android:id="@+id/btnHoloGraph"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginEnd="40dp"
            android:layout_marginStart="40dp"
            android:layout_marginTop="16dp"
            android:text="@string/btnHoloGraph"
            android:onClick="activityHoloGraph"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/btnLottie"
            tools:layout_constraintLeft_creator="1"
            tools:layout_constraintRight_creator="1"/>
</code>
</pre>

## Practica 
Implemente una aplicación que haga un insert de un estudiante (id, nombre, edad, telefono) en un DAO utilizando el patrón MVC. 