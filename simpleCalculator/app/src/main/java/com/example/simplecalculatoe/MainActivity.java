package com.example.simplecalculator;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button sum,mul,div,sub;
    TextView rslt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.first);
        n2 = (EditText) findViewById(R.id.second);
        sum = findViewById(R.id.sum);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        rslt = findViewById(R.id.rslt);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1+f2;
                rslt.setText("Addition = "+cal);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            android:layout_marginBottom="200dp"
 android:text="*"
 app:layout_constraintBottom_toBottomOf="parent"
 app:layout_constraintStart_toEndOf="@+id/sum" />
 <TextView
 android:id="@+id/rslt"
 android:layout_width="124dp"
 android:layout_height="60dp"
 android:layout_marginBottom="96dp"
 android:gravity="center"
 android:text="Result"
 android:textAlignment="center"

android:textAppearance="@style/TextAppearance.AppCompat.Body1"
 android:textSize="20sp"
 app:layout_constraintBottom_toBottomOf="parent"
 app:layout_constraintEnd_toEndOf="parent"
 app:layout_constraintHorizontal_bias="0.466"
 app:layout_constraintStart_toStartOf="parent" />
 <EditText
 android:id="@+id/second"
 android:layout_width="294dp"
 android:layout_height="70dp"
 android:layout_marginBottom="68dp"
 android:ems="10"
 android:inputType="number"
 app:layout_constraintBottom_toTopOf="@+id/sub"
 app:layout_constraintEnd_toEndOf="parent"
 app:layout_constraintHorizontal_bias="0.378"
 app:layout_constraintStart_toStartOf="parent" />
 <EditText
 android:id="@+id/first"
 android:layout_width="301dp"
 android:layout_height="71dp"
 android:layout_marginBottom="20dp"
 android:ems="10"
 android:inputType="number"
 app:layout_constraintBottom_toTopOf="@+id/second"
 app:layout_constraintEnd_toEndOf="parent"
 app:layout_constraintHorizontal_bias="0.4"
 app:layout_constraintStart_toStartOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>

            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1-f2;
                rslt.setText("Subtraction = "+cal);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1/f2;
                rslt.setText("Division = "+cal);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1*f2;
                rslt.setText("Multiplication = "+cal);
            }
        });
    }
}
