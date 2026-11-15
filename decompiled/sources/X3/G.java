package X3;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes2.dex */
public class G extends AbstractC1359h {
    public G(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        if (str.equals(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
            ((H) this.f15703a).setType(view, (String) obj);
        } else {
            super.a(view, str, obj);
        }
    }
}
