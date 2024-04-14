package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints.Companion.Infinity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLarge1Preview()
//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
////                    Greeting("Android")
//
//                }
//            }
        }
    }
}

@Composable
fun AndroidLarge1(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 360.dp)
                .requiredHeight(height = 800.dp)
                .clip(shape = RoundedCornerShape(31.50251007080078.dp))
                .background(color = Color(0xffeff2f3))
        ) {
            Image(
                painter = painterResource(id = R.drawable.lakshmi),
                contentDescription = "image 49",
                modifier = Modifier
                    .requiredWidth(width = 360.dp)
                    .requiredHeight(height = 400.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 377.dp)
                    .requiredWidth(width = 362.dp)
                    .requiredHeight(height = 423.dp)
                    .clip(shape = RoundedCornerShape(31.50251007080078.dp))
                    .background(color = Color.White))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (-2).dp,
                        y = 660.dp)
                    .requiredWidth(width = 368.dp)
                    .requiredHeight(height = 140.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 364.dp)
                        .requiredHeight(height = 139.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle324),
                        contentDescription = "Rectangle 324",
                        modifier = Modifier
                            .requiredWidth(width = 364.dp)
                            .requiredHeight(height = 139.dp)
                            .clip(shape = RoundedCornerShape(31.50251007080078.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.lakshmitrans),
                        contentDescription = "EGrumWqXkAA2PD7-removebg-preview 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 278.dp)
                            .requiredHeight(height = 140.dp)
                            .clip(shape = RoundedCornerShape(31.50251007080078.dp)))
                }
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 364.dp)
                        .requiredHeight(height = 140.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle324),
                        contentDescription = "Rectangle 324",
                        modifier = Modifier
                            .requiredWidth(width = 364.dp)
                            .requiredHeight(height = 140.dp)
                            .clip(shape = RoundedCornerShape(31.50251007080078.dp)))
                    Image(
                        painter = painterResource(id = R.drawable.lakshmitrans),
                        contentDescription = "EGrumWqXkAA2PD7-removebg-preview 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 278.dp)
                            .requiredHeight(height = 140.dp)
                            .clip(shape = RoundedCornerShape(31.50251007080078.dp)))
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 162.16949462890625.dp,
                            y = 15.5552978515625.dp)
                        .requiredWidth(width = 206.dp)
                        .requiredHeight(height = 68.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 206.dp)
                            .requiredHeight(height = 68.dp)
                    ) {
                        Text(
                            text = "Goddess",
                            color = Color.Black.copy(alpha = 0.85f),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 25.20200538635254.sp,
                                fontWeight = FontWeight.Bold),
                            modifier = Modifier
                                .requiredWidth(width = 206.dp)
                                .requiredHeight(height = 68.dp))
                    }
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 26.2520751953125.dp,
                        y = 408.48248291015625.dp)
                    .requiredWidth(width = 304.dp)
                    .requiredHeight(height = 217.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(21.001672744750977.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredWidth(width = 304.dp)
                        .requiredHeight(height = 217.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(all = 3.dp)
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            lineHeight = Infinity.sp,
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = Color.Black,
                                    fontSize = 25.20200538635254.sp,
                                    fontWeight = FontWeight.Bold)) {append("Lakshmi Devi \n")}
                                withStyle(style = SpanStyle(
                                    color = Color.Black,
                                    fontSize = 18.901504516601562.sp)) {append("Forbidden West ")}},
                            modifier = Modifier
                                .requiredWidth(width = 180.dp).requiredHeight(50.dp))
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(2.dp, Alignment.Start),
                        modifier = Modifier
                            .padding(all = 2.dp)
                    ) {
                        Text(
                            text = "Lakshmi is depicted in Indian art as an elegantly dressed, prosperity-showering golden-coloured woman standing or sitting in the padmasana position upon a lotus throne.",
                            color = Color.Black.copy(alpha = 0.8f),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 16.80133819580078.sp),
                            modifier = Modifier
                                .requiredWidth(width = 300.dp))
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.500836372375488.dp, Alignment.CenterHorizontally),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .requiredWidth(width = 155.dp)
                            .requiredHeight(height = 50.dp)
                            .clip(shape = RoundedCornerShape(31.50251007080078.dp))
                            .background(color = Color(0xFFCB2B29))
                            .padding(all = 10.500836372375488.dp)
                    ) {
                        Text(
                            text = "Click Here",
                            color = Color.White.copy(alpha = 0.85f),
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                fontSize = 14.701170921325684.sp,
                                fontWeight = FontWeight.Bold))
                    }
                }
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.500836372375488.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 215.dp,
                        y = 743.dp)
                    .requiredWidth(width = 105.dp)
                    .clip(shape = RoundedCornerShape(31.50251007080078.dp))
                    .background(color = Color(0xFFCB2B29))
                    .padding(all = 10.500836372375488.dp)
            ) {
                Text(
                    text = "Details",
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 13.651086807250977.sp,
                        fontWeight = FontWeight.Bold))
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.500836372375488.dp, Alignment.Start),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 6.dp,
                        y = 14.dp)
                    .clip(shape = RoundedCornerShape(52.50417709350586.dp))
                    .background(color = Color(0xFFBF817A))
                    .padding(all = 10.500836372375488.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow_back_ios_new),
                    contentDescription = "arrow_back_ios_new",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .requiredSize(size = 25.dp))
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.500836372375488.dp, Alignment.Start),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp,
                        y = 14.dp)
                    .clip(shape = RoundedCornerShape(52.50417709350586.dp))
                    .background(color = Color(0xFFBF817A))
                    .padding(all = 10.500836372375488.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.reorder),
                    contentDescription = "reorder",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .requiredSize(size = 25.dp))
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun AndroidLarge1Preview() {
    AndroidLarge1(Modifier)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
}