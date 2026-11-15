package io.invertase.firebase.messaging;

import android.content.Intent;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.AbstractServiceC1308i;
import com.google.firebase.messaging.W;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeFirebaseMessagingHeadlessService extends AbstractServiceC1308i {
    @Override // com.facebook.react.AbstractServiceC1308i
    protected p224w3.a l(Intent intent) {
        if (intent.getExtras() == null) {
            return null;
        }
        return new p224w3.a("ReactNativeFirebaseMessagingHeadlessTask", u.i((W) intent.getParcelableExtra(PglCryptUtils.KEY_MESSAGE)), p089i8.i.h().f("messaging_android_headless_task_timeout", 60000L), true);
    }
}
