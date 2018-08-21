package ru.livli.cardrevealtest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_view, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        cvFrom.setOnClickListener {
//            activity?.let {
//                //                val opt = ActivityOptionsCompat
////                        .makeSceneTransitionAnimation(it, cv, "cv").toBundle()
//
////            startActivity(Intent(this, CardActivity::class.java), opt)
//
//
////                val frag = CardFragment().startAnimation()
//                val frag = CardFragment()
//                frag.sharedElementEnterTransition = CardFragment.DetailsTransition().setDuration(1000)
////                frag.sharedElementEnterTransition = AutoTransition().setDuration(1000)
////                frag.enterTransition = Fade()
////                frag.exitTransition = Fade()
////                frag.sharedElementReturnTransition = AutoTransition().setDuration(1000)
////                frag.sharedElementReturnTransition = CardFragment.DetailsTransition2().setDuration(1000)
////                sharedElementReturnTransition = CardFragment.DetailsTransition2(null).setDuration(1000)
//
//                fragmentManager?.let {
//                    it.beginTransaction()
//                        .addSharedElement(cvFrom, "cvTo")
//                            .addSharedElement(ivFrom, "ivTo")
//                            .addSharedElement(clFrom, "clTo")
//                            .replace(R.id.container, frag)
//                            .addToBackStack(null)
//                            .commit()
//                }
//            }
//        }
    }
}