package com.example.kotlin_chat_app
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MessageAdapter(val context: Context, val messageList: ArrayList<Message>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder.javaClass == sendViewHolder::class.java) {

            val currentMessage = messageList[position]
          val viewHolder = holder as sentViewHolder
            holder.sentMessage.text =
        }else {
            val viewHolder = holder as receiveViewHolder


        }
    }

    override fun getItemCount(): Int {

    }
    class sentViewHolder (itemView:  View) : RecyclerView.ViewHolder(itemView) {
     val sentMessage = itemView.findViewById<TextView>(R.id.text_sent_message)
    }
    class receiveViewHolder (itemView:  View) : RecyclerView.ViewHolder(itemView) {
        val recieveMessage = itemView.findViewById<TextView>(R.id.text_recieve_message)

    }
}