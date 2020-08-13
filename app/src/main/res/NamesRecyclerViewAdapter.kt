import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.row_name_item.view.*

class NamesRecyclerViewAdapter(val namesList: MutableList<students>) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.row_name_item, parent, false)
            return NamesViewHolder(itemView)
        }
        override fun getItemCount(): Int {
            return namesList.size
        }
        override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
            val item: students =namesList[position]
            holder.rowView.etstudentDetails.text= item.name
            holder.rowView.etdateOfBirth.text= item.dateOfBirth
            holder.rowView.ethobby.text= item.hobby
        }
        class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)

    }





















}