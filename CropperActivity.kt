package com.photo.editor.frames.pics.collage.maker.Activities

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding
import com.isseiaoki.simplecropview.CropImageView
import com.photo.editor.frames.pics.collage.maker.R
import com.photo.editor.frames.pics.collage.maker.databinding.ActivityCropperBinding
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException

class CropperActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCropperBinding
    var result: String? = null
    var file_uri: Uri? = null
    private var outFile: File? = null
    private lateinit var uri: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCropperBinding.inflate(layoutInflater)
        setContentView(binding.root)

        readIntent()

        val bitmap: Bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), file_uri)

        binding.cropImageView.imageBitmap = bitmap

        Listner()
    }

    fun readIntent() {
        val intent = intent
        if (intent.extras != null) {
            result = intent.getStringExtra("BitmapImage")
            file_uri = Uri.parse(result)
        }
    }

    private fun Listner() {
        binding.freebtn.setOnClickListener {
            binding.cropImageView.setCropMode(CropImageView.CropMode.FREE)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                R.drawable.insta_graysqure,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_w,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.IG11.setOnClickListener {
            binding.cropImageView.setCustomRatio(1, 1)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                R.drawable.insta_graysqure,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_w,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.instaStory.setOnClickListener {
            binding.cropImageView.setCustomRatio(9, 16)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                R.drawable.insta_graysqure,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_w,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.IG45.setOnClickListener {
            binding.cropImageView.setCustomRatio(4, 5)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_w,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.fpost.setOnClickListener {
            binding.cropImageView.setCustomRatio(1.91.toInt(), 1)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_w,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.fcover.setOnClickListener {
            binding.cropImageView.setCustomRatio(16, 9)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_w,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.youtCover.setOnClickListener {
            binding.cropImageView.setCustomRatio(19, 9)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_w,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.tweetpost.setOnClickListener {
            binding.cropImageView.setCustomRatio(16, 9)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_w,
                R.drawable.twitter_b,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.tweetheader.setOnClickListener {
            binding.cropImageView.setCustomRatio(3, 1)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_w,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.crop34.setOnClickListener {
            binding.cropImageView.setCustomRatio(3, 4)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_whitesqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                0,
                0,
                0,
                0,
                0
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.crop43.setOnClickListener {
            binding.cropImageView.setCustomRatio(4, 3)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_whitesqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                0,
                0,
                0,
                0,
                0,
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191",
                "#919191"
            )
        }

        binding.crop916.setOnClickListener {
            binding.cropImageView.setCustomRatio(9, 16)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_whitesqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                0,
                0,
                0,
                0,
                0,
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191",
                "#919191"
            )
        }

        binding.crop169.setOnClickListener {
            binding.cropImageView.setCustomRatio(16, 9)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_whitesqure,
                R.drawable.insta_graysqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                0,
                0,
                0,
                0,
                0,
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF",
                "#919191"
            )
        }

        binding.crop75.setOnClickListener {
            binding.cropImageView.setCustomRatio(7, 5)
//            setPaddingImage(10,10,2,10,10,2,2,2,2,0,0,0,0,0)
            setBackgroundImage(
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_graysqure,
                R.drawable.insta_whitesqure
            )
            setSrcImage(
                R.drawable.__corner_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.instagram_b,
                R.drawable.facebook_b,
                R.drawable.facebook_b,
                R.drawable.youtube_b,
                R.drawable.twitter_b,
                R.drawable.twitter_b,
                0,
                0,
                0,
                0,
                0,
            )
            setTextColor(
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#919191",
                "#FFFFFFFF"
            )
        }

        binding.okbutton.setOnClickListener {
            saveImage(binding.cropImageView.croppedBitmap)

            val returnIntent = Intent()
            val uri = Uri.fromFile(outFile)
            returnIntent.putExtra("RESULT", uri.toString() + "")
            setResult(-1, returnIntent)
            finish()
        }

        binding.canclebutton.setOnClickListener {
            finish()
        }
    }

    private fun setPaddingImage(
        freeImage: Int,
        insta1: Int,
        instaStory: Int,
        imageview45: Int,
        fpostImage: Int,
        fcoverImage: Int,
        youtubeImage: Int,
        tpostImage: Int,
        theaderImage: Int,
        image34: Int,
        image43: Int,
        image96: Int,
        image169: Int,
        image75: Int
    ) {
        binding.freeImageview.setPadding(freeImage)
        binding.insta1image.setPadding(insta1)
        binding.instaStoryImage.setPadding(instaStory)
        binding.Imageview45.setPadding(imageview45)
        binding.fpostImageview.setPadding(fpostImage)
        binding.fcoverImageview.setPadding(fcoverImage)
        binding.youtubeImage.setPadding(youtubeImage)
        binding.tpostImageview.setPadding(tpostImage)
        binding.theaderImage.setPadding(theaderImage)
        binding.Imageview34.setPadding(image34)
        binding.Imageview43.setPadding(image43)
        binding.imageview916.setPadding(image96)
        binding.imageview169.setPadding(image169)
        binding.imageview75.setPadding(image75)
    }

    private fun setBackgroundImage(
        freeImage: Int,
        insta1: Int,
        instaStory: Int,
        imageview45: Int,
        fpostImage: Int,
        fcoverImage: Int,
        youtubeImage: Int,
        tpostImage: Int,
        theaderImage: Int,
        image34: Int,
        image43: Int,
        image96: Int,
        image169: Int,
        image75: Int
    ) {
        binding.freeImageview.setBackgroundResource(freeImage)
        binding.insta1image.setBackgroundResource(insta1)
        binding.instaStoryImage.setBackgroundResource(instaStory)
        binding.Imageview45.setBackgroundResource(imageview45)
        binding.fpostImageview.setBackgroundResource(fpostImage)
        binding.fcoverImageview.setBackgroundResource(fcoverImage)
        binding.youtubeImage.setBackgroundResource(youtubeImage)
        binding.tpostImageview.setBackgroundResource(tpostImage)
        binding.theaderImage.setBackgroundResource(theaderImage)
        binding.Imageview34.setBackgroundResource(image34)
        binding.Imageview43.setBackgroundResource(image43)
        binding.imageview916.setBackgroundResource(image96)
        binding.imageview169.setBackgroundResource(image169)
        binding.imageview75.setBackgroundResource(image75)
    }

    private fun setSrcImage(
        freeImage: Int,
        insta1: Int,
        instaStory: Int,
        imageview45: Int,
        fpostImage: Int,
        fcoverImage: Int,
        youtubeImage: Int,
        tpostImage: Int,
        theaderImage: Int,
        image34: Int,
        image43: Int,
        image96: Int,
        image169: Int,
        image75: Int
    ) {
        binding.freeImageview.setImageResource(freeImage)
        binding.insta1image.setImageResource(insta1)
        binding.instaStoryImage.setImageResource(instaStory)
        binding.Imageview45.setImageResource(imageview45)
        binding.fpostImageview.setImageResource(fpostImage)
        binding.fcoverImageview.setImageResource(fcoverImage)
        binding.youtubeImage.setImageResource(youtubeImage)
        binding.tpostImageview.setImageResource(tpostImage)
        binding.theaderImage.setImageResource(theaderImage)
        binding.Imageview34.setImageResource(image34)
        binding.Imageview43.setImageResource(image43)
        binding.imageview916.setImageResource(image96)
        binding.imageview169.setImageResource(image169)
        binding.imageview75.setImageResource(image75)
    }

    private fun setTextColor(
        freeImage: String,
        insta1: String,
        instaStory: String,
        imageview45: String,
        fpostImage: String,
        fcoverImage: String,
        youtubeImage: String,
        tpostImage: String,
        theaderImage: String,
        image34: String,
        image43: String,
        image96: String,
        image169: String,
        image75: String
    ) {
        binding.freeTextview.setTextColor(Color.parseColor(freeImage))
        binding.insta1textview.setTextColor(Color.parseColor(insta1))
        binding.instaStoryText.setTextColor(Color.parseColor(instaStory))
        binding.textview45.setTextColor(Color.parseColor(imageview45))
        binding.fpostTextview.setTextColor(Color.parseColor(fpostImage))
        binding.fcoverText.setTextColor(Color.parseColor(fcoverImage))
        binding.youtubeText.setTextColor(Color.parseColor(youtubeImage))
        binding.tpostTextview.setTextColor(Color.parseColor(tpostImage))
        binding.theaderText.setTextColor(Color.parseColor(theaderImage))
        binding.textview34.setTextColor(Color.parseColor(image34))
        binding.textview43.setTextColor(Color.parseColor(image43))
        binding.textview916.setTextColor(Color.parseColor(image96))
        binding.textview169.setTextColor(Color.parseColor(image169))
        binding.textview75.setTextColor(Color.parseColor(image75))
    }

    fun saveImage(bitmap: Bitmap) {
        var outStream: FileOutputStream? = null
        uri = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
            .toString() + File.separator + "/Dcim/temp"
        val dir = File(uri)
        if (!dir.exists()) {
            dir.mkdirs()
        }
        val fileName = String.format("%d.jpg", System.currentTimeMillis())
        outFile = File(dir, fileName)
        try {
            outStream = FileOutputStream(outFile)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outStream)
        try {
            outStream!!.flush()
            outStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}