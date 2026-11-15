package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p258z7.a;
import u9.c;

/* JADX INFO: loaded from: classes3.dex */
public class ChromeTabsManagerActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f42057a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42058b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42059c = false;

    private static Intent a(Context context) {
        return new Intent(context, (Class<?>) ChromeTabsManagerActivity.class);
    }

    public static Intent b(Context context) {
        Intent intentA = a(context);
        intentA.addFlags(67108864);
        return intentA;
    }

    public static Intent c(Context context, Intent intent) {
        Intent intentA = a(context);
        intentA.putExtra("browserIntent", intent);
        return intentA;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (!getIntent().hasExtra("browserIntent") || (bundle != null && bundle.getString("browserResultType") != null)) {
                finish();
                return;
            }
            Intent intent = (Intent) getIntent().getParcelableExtra("browserIntent");
            intent.addFlags(67108864);
            startActivity(intent);
            this.f42058b = "dismiss";
        } catch (Exception e10) {
            this.f42059c = true;
            c.d().m(new a("Unable to open url.", this.f42058b, Boolean.valueOf(this.f42059c)));
            finish();
            e10.printStackTrace();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        String str = this.f42058b;
        if (str != null) {
            str.getClass();
            if (str.equals("cancel")) {
                c.d().m(new a("chrome tabs activity closed", this.f42058b, Boolean.valueOf(this.f42059c)));
            } else {
                c.d().m(new a("chrome tabs activity destroyed", "dismiss", Boolean.valueOf(this.f42059c)));
            }
            this.f42058b = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f42058b = bundle.getString("browserResultType");
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f42057a) {
            this.f42057a = true;
        } else {
            this.f42058b = "cancel";
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putString("browserResultType", "dismiss");
        super.onSaveInstanceState(bundle);
    }
}
