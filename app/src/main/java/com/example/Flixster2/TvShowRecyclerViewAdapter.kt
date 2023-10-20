package com.example.Flixster2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.Flixster2.R.id

/**
 * [RecyclerView.Adapter] that can display a [TvShow] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 */
class TvShowRecyclerViewAdapter(
    private val TvShows: List<TvShow>,
    private val mListener: OnListFragmentInteractionListener?
)
    : RecyclerView.Adapter<TvShowRecyclerViewAdapter.TvShowViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_tvshow, parent, false)
        return TvShowViewHolder(view)
    }

    /**
     * This inner class lets us refer to all the different View elements
     * (Yes, the same ones as in the XML layout files!)
     */
    inner class TvShowViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: TvShow? = null
        val mTvShowTitle: TextView = mView.findViewById<View>(id.tvshow_title) as TextView
        //        val mMovieDescription: TextView = mView.findViewById<View>(id.movie_description) as TextView
        val mTvShowImage: ImageView = mView.findViewById<View>(id.tvshow_poster) as ImageView
    }

    /**
     * This lets us "bind" each Views in the ViewHolder to its' actual data!
     */
    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvshow = TvShows[position]

        holder.mItem = tvshow
        holder.mTvShowTitle.text = tvshow.title
//        holder.mMovieDescription.text = movie.description

        holder.mView.setOnClickListener {
            holder.mItem?.let { show ->
                mListener?.onItemClick(show)
            }
        }

        Glide.with(holder.mView)
            .load("https://image.tmdb.org/t/p/w500" + tvshow.imagePosterPath)
            .placeholder(R.drawable.ic_launcher_background)
            .centerInside()
            .into(holder.mTvShowImage)
    }

    /**
     * Remember: RecyclerView adapters require a getItemCount() method.
     */
    override fun getItemCount(): Int {
        return TvShows.size
    }
}