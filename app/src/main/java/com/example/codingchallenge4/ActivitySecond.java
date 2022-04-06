package com.example.codingchallenge4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent =getIntent();
        String message =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView articleHeader =findViewById(R.id.articleHeader);
        TextView articleBody = findViewById(R.id.articleBody);
        articleHeader.setText(message);

        String text="";

        if (message.equals("Text One")){
            text="Founded in 2011, The British College offers world-class education for students in Nepal who are aspiring to gain internationally recognised qualifications from their two partner British Universities, the University of the West of England (UWE) and Leeds Beckett University (LBU). "+
                    "\n\n In this regard, we have been successful in establishing a distinctive identity as the pioneering global college in Nepal and offer reputed UK degrees and courses which are relevant to the current job market, and enhance the employability of each and every studen"+
                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\nOur aim is to provide students with a global learning experience and worldwide opportunities - and we are defined by our local-to-global approach in the provision of our degrees and courses which are staffed by tutors and administrative personnel from the UK and Nepal. In this way, the College provides premium education that compels students and staff to be globally minded - a notion which is further encouraged by the student exchange programmes and internships that we offer with multinational companies." +
                    "" +
                    "\n Our aim is to provide students with a global learning experience and worldwide opportunities - and we are defined by our local-to-global approach in the provision of our degrees and courses which are staffed by tutors and administrative personnel from the UK and Nepal. In this way, the College provides premium education that compels students and staff to be globally minded - a notion which is further encouraged by the student exchange programmes and internships that we offer with multinational companies.";
        }

        else if (message.equals("Text Two")){
            text="We also believe that supporting and interacting with the local community is an integral part of student life, and we are committed to achieving excellence in our research and upholding the highest standards of integrity. "+
                    "\n\nTo be a world-class college in Nepal offering high quality British and international qualifications equipping our graduates with the broad knowledge, skills and values they need for success in the global job market and becoming creative entrepreneurs. "+
                    "\n\nTo transform lives by making high-quality British education an affordable, accessible opportunity for all in Nepal, and regions.";
        }

        else{

            text = "The British College provides a wide range of computing resources and support services. There are three computer laboratories at TBC with approximately 100 computers available. \n\nThe College has a leased line with high-speed bandwidth to provide round the clock Internet access to students to enable them to remain connected with the information superhighway. \n\nEach computer has power back up. The Computer Lab is also equipped with HD Multimedia facilities.";
        }

        articleBody.setText(text);

    }
}