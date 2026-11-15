package com.miningmafia.app.ui.accounts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.miningmafia.app.R;
import com.miningmafia.app.databinding.FragmentAccountsBinding;
import com.miningmafia.app.data.remote.model.AccountBalance;
import com.miningmafia.app.ui.viewmodel.AccountsViewModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Accounts screen: list connected accounts, link new ones, disconnect.
 */
public class AccountsFragment extends Fragment {

    private FragmentAccountsBinding binding;
    private AccountsViewModel viewModel;
    private AccountAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAccountsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(AccountsViewModel.class);

        adapter = new AccountAdapter(new ArrayList<>(), accountId -> {
            viewModel.unlink(accountId);
        });
        binding.recyclerAccounts.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.recyclerAccounts.setAdapter(adapter);

        viewModel.accounts.observe(getViewLifecycleOwner(), accounts -> {
            adapter.submitList(accounts != null ? accounts : new ArrayList<>());
            binding.txtEmpty.setVisibility((accounts == null || accounts.isEmpty()) ? View.VISIBLE : View.GONE);
        });

        viewModel.uiState.observe(getViewLifecycleOwner(), state -> {
            if (state.error != null) Toast.makeText(requireContext(), state.error, Toast.LENGTH_LONG).show();
            if (state.message != null) Toast.makeText(requireContext(), state.message, Toast.LENGTH_SHORT).show();
        });

        binding.btnAdd.setOnClickListener(v -> showLinkDialog());
        viewModel.load();
    }

    private void showLinkDialog() {
        // Simplified: prompt for email/password link. Google linking handled by Auth flow.
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(requireContext());
        builder.setTitle("Link Account");
        builder.setMessage("Link via email/password (Google linking uses the sign-in flow).");
        final android.widget.EditText email = new android.widget.EditText(requireContext());
        email.setHint("Email");
        final android.widget.EditText pass = new android.widget.EditText(requireContext());
        pass.setHint("Password");
        pass.setInputType(android.text.InputType.TYPE_CLASS_TEXT | android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD);
        android.widget.LinearLayout layout = new android.widget.LinearLayout(requireContext());
        layout.setOrientation(android.widget.LinearLayout.VERTICAL);
        layout.addView(email);
        layout.addView(pass);
        builder.setView(layout);
        builder.setPositiveButton("Link", (d, w) -> {
            viewModel.linkEmail(email.getText().toString(), pass.getText().toString());
        });
        builder.setNegativeButton("Cancel", null);
        builder.show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private static class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
        private List<AccountBalance> items = new ArrayList<>();
        private final java.util.function.Consumer<String> onDisconnect;

        AccountAdapter(List<AccountBalance> items, java.util.function.Consumer<String> onDisconnect) {
            this.items = items;
            this.onDisconnect = onDisconnect;
        }

        void submitList(List<AccountBalance> list) {
            this.items = list != null ? list : new ArrayList<>();
            notifyDataSetChanged();
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_account, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            AccountBalance a = items.get(position);
            holder.txtName.setText(a.displayName != null ? a.displayName : a.email);
            holder.txtEmail.setText(a.email);
            holder.txtBalance.setText(String.format("%.8f", a.balance));
            holder.txtCurrency.setText(a.currency);
            holder.txtStatus.setText(a.connected ? "Connected" : "Disconnected");
            holder.txtStatus.setTextColor(holder.itemView.getResources().getColor(
                    a.connected ? R.color.mining_active : R.color.mining_inactive));
            holder.btnDisconnect.setOnClickListener(v -> onDisconnect.accept(a.id));
        }

        @Override
        public int getItemCount() { return items.size(); }

        static class ViewHolder extends RecyclerView.ViewHolder {
            TextView txtName, txtEmail, txtBalance, txtCurrency, txtStatus;
            com.google.android.material.button.MaterialButton btnDisconnect;
            ViewHolder(View v) {
                super(v);
                txtName = v.findViewById(R.id.txtName);
                txtEmail = v.findViewById(R.id.txtEmail);
                txtBalance = v.findViewById(R.id.txtBalance);
                txtCurrency = v.findViewById(R.id.txtCurrency);
                txtStatus = v.findViewById(R.id.txtStatus);
                btnDisconnect = v.findViewById(R.id.btnDisconnect);
            }
        }
    }
}
