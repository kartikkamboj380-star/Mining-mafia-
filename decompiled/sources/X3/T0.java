package X3;

import android.view.View;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes2.dex */
public class T0 extends AbstractC1359h {
    public T0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        if (str.equals(MediationMetaData.KEY_NAME)) {
            ((U0) this.f15703a).setName(view, obj == null ? "" : (String) obj);
        } else {
            super.a(view, str, obj);
        }
    }
}
