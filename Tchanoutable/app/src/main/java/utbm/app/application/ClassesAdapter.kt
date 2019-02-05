package utbm.app.application

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_class.view.*
import utbm.app.application.model.Class
import utbm.app.application.util.TimeUtils
import utbm.app.application.util.getLayoutInflater

class ClassesAdapter(val day: Int, classes: List<Class>) : RecyclerView.Adapter<ClassesAdapter.ViewHolder>() {

    val dataset: List<Class> = classes.filter { it.day == day }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = parent.getLayoutInflater().inflate(R.layout.item_class, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]

        holder.view.nom.text = item.nom ?: "?"
        holder.view.prof.text = item.prof ?: "?"
        holder.view.lieu.text = item.lieu ?: "?"
        holder.view.debut.text = TimeUtils.getDisplayableTime(item.debut ?: -1)
        holder.view.fin.text = TimeUtils.getDisplayableTime(item.fin ?: -1)


        if (item.length > 1) {
            holder.view.layoutParams.height =
                    (holder.view.context.resources.getDimension(R.dimen.class_item_height) * 2).toInt()
        }
    }

    override fun getItemCount(): Int = dataset.size

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}
