const formatCurrent = (Number) => {
    return Number.toLocaleString('en-US', {
        style: 'currency',
        currency: 'USD'
    })
}

export default formatCurrent;