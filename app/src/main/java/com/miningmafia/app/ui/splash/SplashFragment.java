package com.miningmafia.app.ui.splash;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.miningmafia.app.R;
import com.miningmafia.app.app.MiningMafiaApplication;
import com.miningmafia.app.auth.AuthRepository;

/**
 * Splash screen: briefly shows branding, then routes to Home (signed in) or Auth (not signed in).
 */
public class SplashFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController nav = Navigation.findNavController(view);

        new Handler().postDelayed(() -> {
            AuthRepository auth = MiningMafiaApplication.getContainer().getAuthRepository();
            if (auth.isSignedIn()) {
                nav.navigate(R.id.action_splash_to_home);
            } else {
                nav.navigate(R.id.action_splash_to_auth);
            }
        }, 1500);
    }
}
