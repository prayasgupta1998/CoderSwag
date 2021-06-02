package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(context: Context, categories:List<Category>): BaseAdapter() {

    // every adapter that inherits from BaseAdapter has the following 4 methods.

    val context = context  // creating a var context and setting it equal to context which is passed into the function.
    val categories = categories // similar

    override fun getCount(): Int {
        return categories.count()
        // this function is telling the listview how many rows that it is going to be displaying
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        // defines unique id for each row
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView==null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        } else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

//        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
//        // LayoutInflator takes an xml layout and it turns it into an actual view.
//        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
//        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
        // this is not the best way to implement the list view because each time we display a category or scroll through it,
        // we go to a new view hence the getView function is called again and again.
        // so it is heavy computing. Therefore, we use viewHolders.

        val category = categories[position]

        // setting category name was easy. but for images we need another way because android uses reference by IDs.
        // but we do not have ids for images. So we do the following:
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        println(resourceId)

        holder.categoryName?.text = category.title
        return categoryView
    }

    private class ViewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null

    }
}