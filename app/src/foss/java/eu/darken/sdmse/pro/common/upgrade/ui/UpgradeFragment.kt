package eu.darken.sdmse.common.upgrade.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import eu.darken.sdmse.pro.R
import eu.darken.sdmse.pro.common.uix.Fragment3
import eu.darken.sdmse.pro.common.viewbinding.viewBinding
import eu.darken.sdmse.pro.databinding.UpgradeFragmentBinding

@AndroidEntryPoint
class UpgradeFragment : Fragment3(R.layout.upgrade_fragment) {

    override val vm: UpgradeViewModel by viewModels()
    override val ui: UpgradeFragmentBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        ui.toolbar.setupWithNavController(findNavController())

        ui.upgradeGithubSponsorsAction.setOnClickListener {
            Toast.makeText(
                requireContext(),
                R.string.upgrade_screen_thanks_toast,
                Toast.LENGTH_LONG,
            ).show()
            vm.goGithubSponsors()
        }

        super.onViewCreated(view, savedInstanceState)
    }

}
