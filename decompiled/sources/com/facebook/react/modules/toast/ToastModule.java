package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.q;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@p234x3.a(name = "ToastAndroid")
@Metadata
public final class ToastModule extends NativeToastAndroidSpec {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final String DURATION_LONG_KEY = "LONG";

    @NotNull
    private static final String DURATION_SHORT_KEY = "SHORT";

    @NotNull
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";

    @NotNull
    private static final String GRAVITY_CENTER = "CENTER";

    @NotNull
    private static final String GRAVITY_TOP_KEY = "TOP";

    @NotNull
    public static final String NAME = "ToastAndroid";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(ToastModule toastModule, String str, int i10) {
        Toast.makeText(toastModule.getReactApplicationContext(), str, i10).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravity$lambda$1(ToastModule toastModule, String str, int i10, int i11) {
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i10);
        toastMakeText.setGravity(i11, 0, 0);
        toastMakeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWithGravityAndOffset$lambda$2(ToastModule toastModule, String str, int i10, int i11, int i12, int i13) {
        Toast toastMakeText = Toast.makeText(toastModule.getReactApplicationContext(), str, i10);
        toastMakeText.setGravity(i11, i12, i13);
        toastMakeText.show();
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    @NotNull
    protected Map<String, Object> getTypedExportedConstants() {
        return E.l(q.a(DURATION_SHORT_KEY, 0), q.a(DURATION_LONG_KEY, 1), q.a(GRAVITY_TOP_KEY, 49), q.a(GRAVITY_BOTTOM_KEY, 81), q.a(GRAVITY_CENTER, 17));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(@Nullable final String str, double d10) {
        final int i10 = (int) d10;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.c
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.show$lambda$0(this.f15029a, str, i10);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(@Nullable final String str, double d10, double d11) {
        final int i10 = (int) d10;
        final int i11 = (int) d11;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.b
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravity$lambda$1(this.f15025a, str, i10, i11);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(@Nullable final String str, double d10, double d11, double d12, double d13) {
        final int i10 = (int) d10;
        final int i11 = (int) d11;
        final int i12 = (int) d12;
        final int i13 = (int) d13;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.a
            @Override // java.lang.Runnable
            public final void run() {
                ToastModule.showWithGravityAndOffset$lambda$2(this.f15019a, str, i10, i11, i12, i13);
            }
        });
    }
}
