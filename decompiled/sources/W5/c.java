package W5;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public interface c {

    public interface a {
        void onConsentInfoUpdateFailure(e eVar);
    }

    public interface b {
        void onConsentInfoUpdateSuccess();
    }

    /* JADX INFO: renamed from: W5.c$c, reason: collision with other inner class name */
    public enum EnumC0110c {
        UNKNOWN,
        NOT_REQUIRED,
        REQUIRED
    }

    boolean canRequestAds();

    int getConsentStatus();

    EnumC0110c getPrivacyOptionsRequirementStatus();

    boolean isConsentFormAvailable();

    void requestConsentInfoUpdate(Activity activity, d dVar, b bVar, a aVar);

    void reset();
}
