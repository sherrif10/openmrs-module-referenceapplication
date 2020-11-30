<p>
    <label>
        ${config.label}
        <span>(${ ui.message("emr.formValidation.messages.requiredField.label") })</span>
    </label>
    <select name="${config.formFieldName}">
        <option value="">Select One</option>
        <option value ="165932">National</option>
        <option value ="165933">Foreigner</option>
        <option value ="165934">Refugee</option>
    </select>
    <span class="field-error"></span>
</p>