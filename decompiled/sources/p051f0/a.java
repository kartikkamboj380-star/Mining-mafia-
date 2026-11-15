package p051f0;

import N.f;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f43529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43530b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43531c = 0;

    /* JADX INFO: renamed from: f0.a$a, reason: collision with other inner class name */
    private static class C0422a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EditText f43532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f43533b;

        C0422a(EditText editText, boolean z9) {
            this.f43532a = editText;
            g gVar = new g(editText, z9);
            this.f43533b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(p051f0.b.getInstance());
        }

        @Override // f0.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // f0.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f43532a, inputConnection, editorInfo);
        }

        @Override // f0.a.b
        void c(boolean z9) {
            this.f43533b.c(z9);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z9);
    }

    public a(EditText editText, boolean z9) {
        f.h(editText, "editText cannot be null");
        this.f43529a = new C0422a(editText, z9);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f43529a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f43529a.b(inputConnection, editorInfo);
    }

    public void c(boolean z9) {
        this.f43529a.c(z9);
    }
}
