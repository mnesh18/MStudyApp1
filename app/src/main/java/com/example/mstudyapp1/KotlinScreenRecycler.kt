package com.example.mstudyapp1

import android.app.AlertDialog
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KotlinScreenRecycler:RecyclerView.Adapter<KotlinScreenRecycler.ViewHolder>() {

    private val titles = listOf<String>(
            "var and val",
            "User Input",
            "String",
            "Data Types",
            "Basic Operation"
    )
    private val describes = listOf<String>(
            "Declaring variables.",
            "Getting user input.",
            "String concatenation, interpolation, and methods.",
            "Understanding data types.",
            "Performing math operation in Kotlin."
    )
    private val notes = listOf<String>(
            "Kotlin requires each variable to be labeled val or var.  Variables labeled with the val keyword are immutable, meaning they can not be reassigned later.  On the other hand, variables with the var keyword are mutable and can be changed anytime.",
            "User input in Kotlin is very simple.  We simply create a variable that holds the input, then get the user input with readLine()",
            """- String concatenation refers to combining strings (or other data types) with the use of a + sign.
- String Interpolation, on the other hand, allows us to inject variables into a string.
            """.trimMargin(),
            """- Int
- String
- Boolean
- Char
- Float
            """.trimMargin(),
            """+
-
*
/
%
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
                        R.layout.item_kotlin,
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