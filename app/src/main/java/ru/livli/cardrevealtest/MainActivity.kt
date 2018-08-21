package ru.livli.cardrevealtest

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.transition.*
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //first
//        supportFragmentManager
//                .beginTransaction()
//                .replace(R.id.container, MainFragment())
//                .addToBackStack(null)
//                .commit()


        //second
//        supportPostponeEnterTransition()
//        cvFrom.setOnClickListener {
////            val set = TransitionSet().apply {
////                addTransition(ChangeBounds())
////                addTransition(ChangeTransform().apply {
////                    reparent = false
////                    reparentWithOverlay = false
////                })
////                addTransition(ChangeImageTransform())
////            }
////            window.enterTransition = set
////        window.sharedElementEnterTransition = set
//
////            window.sharedElementEnterTransition = set
//
//            val sharedElements = mutableListOf<android.support.v4.util.Pair<View, String>>()
//            ViewCompat.setTransitionName(cvFrom, "cvTo")
////            ViewCompat.setTransitionName(iv, "ivTo")
////            ViewCompat.setTransitionName(clTo, "clTo")
//            sharedElements.add(Pair(cvFrom, "cvTo"))
////            sharedElements.add(Pair(iv, "ivTo"))
////            sharedElements.add(Pair(clTo, "clTo"))
//            val opt = ActivityOptionsCompat
//                    .makeSceneTransitionAnimation(this, *sharedElements.toTypedArray()).toBundle()
//
//            startActivity(Intent(this, CardActivity::class.java), opt)
//        }

        //third
//        cvFrom.setOnClickListener {
//            val set = TransitionSet().apply {
//                addTransition(ChangeBounds())
//                addTransition(ChangeTransform().apply {
//                    reparent = false
//                    reparentWithOverlay = false
//                })
//                addTransition(ChangeImageTransform())
//            }
//            set.addTarget("ivTo")
//            TransitionManager.go(Scene(root2), set)
//
//            android.support.transition.TransitionManager.beginDelayedTransition(root2, set)
//            iv2.visibility = View.VISIBLE
//        }

        //forth

        cvFrom.setOnClickListener {
            val set = TransitionSet().apply {
                addTransition(ChangeBounds())
                addTransition(ChangeTransform().apply {
                    reparent = false
                    reparentWithOverlay = false
                })
                addTransition(ChangeImageTransform())
            }
            val constraintSet = ConstraintSet()
            constraintSet.clone(this, R.layout.second_xml)
//            TransitionManager.beginDelayedTransition(root3, set)
            TransitionManager.beginDelayedTransition(root, set)
            constraintSet.applyTo(root)
//            constraintSet.applyTo(root3)
        }
    }
}
