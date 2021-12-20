package com.example.mstudyapp1

import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AndroidScreenRecycler: RecyclerView.Adapter<AndroidScreenRecycler.ViewHolder>() {

    private val titles = listOf<String>(
        "Project Setup",
        "Console",
        "UI Elements"
    )
    private val describes = listOf<String>(
        "Setting up an Android Studio Project.",
        "Printing to the console.",
        "See different UI Elements."
    )
    private val notes = listOf<String>(
        """1- Download Android Studio.
2- We will start by opening Android Studio and clicking on "Create New Project".
3- We will choose "Empty Activity" to allow Android Studio to set up a basic project structure for us. Click Next to move to the next screen.
       """.trimMargin(),
        "Once we launch our application, we can use the console to print information while we develop our app. Anything that prints to the console will be invisible to the end-user.",
        """- Each item we used in the last lesson is considered a UI (User Interface) Element.
UI Elements:
1- TextView.
2- Button.
3- EditText
        """.trimMargin()
    )

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemTitle: TextView = itemView.findViewById(R.id.title)
        var itemDescribe: TextView = itemView.findViewById(R.id.describe)

        init {
            itemView.setOnClickListener{
                val builder = AlertDialog.Builder(itemView.context)
                builder.setTitle(titles[adapterPosition])
                builder.setMessage(notes[adapterPosition])
                builder.setPositiveButton("Ok", DialogInterface.OnClickListener { _, _ ->
                })
                builder.show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_android,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDescribe.text = describes[position]
    }

    override fun getItemCount(): Int = titles.size

}