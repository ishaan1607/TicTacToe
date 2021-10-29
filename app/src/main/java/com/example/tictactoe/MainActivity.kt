package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mAdapter: TicTacToeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mAdapter = TicTacToeAdapter()

        setRecyclerView()
    }

    private fun setRecyclerView() {
        binding.recyclerView.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 3)
        }
    }
}