<p>
    <label>
        ${config.label}
        <span>(${ ui.message("emr.formValidation.messages.requiredField.label") })</span>
    </label>
    <select name="${config.formFieldName}">
        <option value="">Select One</option>
        <option value ="165923">0 - Child</option>
        <option value ="165924">1 - Never Married/Single</option>
        <option value ="165925">2 - Living Together</option>
        <option value ="165926">3 - Married</option>
        <option value ="165927">4 - Divorced</option>
        <option value ="165928">5-Separated</option>
        <option value ="165929">6- Widowed</option>
    </select>
    <span class="field-error"></span>
</p>