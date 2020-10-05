package edu.cs.birzeit.bookstore2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import edu.cs.birzeit.bookstore2.model.Book;

import edu.cs.birzeit.bookstore2.model.BookFactory;
import edu.cs.birzeit.bookstore2.model.IBookDa;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        edt=findViewById(R.id.edtSelectBook);
        populateSpinner();

    }

    private void populateSpinner() {
        BookFactory factory = new BookFactory();
        IBookDa objBook=factory.getModel();
        String[] cats = objBook.getCat();
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,cats);
        spinner.setAdapter(adapter);
    }


    public void btnGetBooksOnClick(View view) {
        BookFactory factory = new BookFactory();
        IBookDa objBook=factory.getModel();
        String item ="";
        item = spinner.getSelectedItem().toString();
        List<Book> books = objBook.getBooks(item);
        String str ="";
        for (Book b :books){
            str+=b.getTitle()+"\n";
        }
        edt.setText(str);
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}